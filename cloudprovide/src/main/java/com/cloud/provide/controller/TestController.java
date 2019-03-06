package com.cloud.provide.controller;

import java.util.List;

import com.cloud.provide.config.BootStrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class TestController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
    private Registration registration;       // 服务注册
	
	@RequestMapping("/test")
	public String test(){
		ServiceInstance instance = serviceInstance();
        String result = "provider service, host = " + instance.getHost() + ", service_id = " + instance.getServiceId()+" ;;;  "+ BootStrap.getName();
        return result;
	}
	
	/**
     * 获取当前服务的服务实例
     *
     * @return ServiceInstance
     */
    public ServiceInstance serviceInstance() {
        List<ServiceInstance> list = discoveryClient.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

}
