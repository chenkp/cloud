package com.cloud.consumer.controller;

import com.cloud.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class TestController {
	
//	@Autowired
//    RestTemplate restTemplate;
	
	@Autowired
	private TestService testService;
	
	//ribbon的调用方式
//    @RequestMapping("/test")
//    public String test(){
//       //下面这个地址就是2个服务端的   服务名称+新建的controller的开放接口...
//    	return restTemplate.getForObject("http://cloud-provide/service/test", String.class);
//    }
    
    //feign方式
    @RequestMapping("/test")
    public String ss(){
    	return testService.test();
    }
}
