package com.irok.microservices.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irok.microservices.limitsservices.bean.LimitsConfiguration;
import com.irok.microservices.limitsservices.config.Configuration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	
	@GetMapping("limits")
	public LimitsConfiguration retriveLimitConfig()
	{
		return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
	
	

}
