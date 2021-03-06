package com.irok.microservices.currencyexchangeservices.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.irok.microservices.currencyexchangeservices.entity.ExchangeValue;
import com.irok.microservices.currencyexchangeservices.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment env;
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	@GetMapping("currencyexchange/{from}/To/{to}")
	public ExchangeValue getExchangeCurrency(@PathVariable String from ,@PathVariable String to)
	{
		
		ExchangeValue exhangeValue=exchangeValueRepository.findByFromAndTo(from, to);
		exhangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return exhangeValue;
		
	}

}
