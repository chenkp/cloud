package com.cloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign 方式
 */
@FeignClient(value = "cloud-provide")
public interface TestService {

	@RequestMapping("/provide/service/test")
	String test();
}
