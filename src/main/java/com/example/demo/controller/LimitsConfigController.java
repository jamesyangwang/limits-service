package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.Config;
import com.example.demo.model.LimitConfig;

@RestController
public class LimitsConfigController {

	@Autowired
	private Config config;
	
//	@Value("${limits-service.max}")
//	private int max;
//	
//	@Value("${limits-service.min}")
//	private int min;
	
	@GetMapping("/limits")
	public LimitConfig retrieveLimitsFromConfig() {
//		return new LimitConfig(max, min);
		return new LimitConfig(config.getMax(), config.getMin());
	}
}

//http://localhost:8080/limits
