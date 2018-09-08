package com.irok.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.irok.microservices.currencyconversionservice.controller.bean.CurrencyConvertorConfig;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("currencyConversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConvertorConfig currencyCalculator(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity)
	{
		
		HashMap<String,String> uriVariable=new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);
	ResponseEntity<CurrencyConvertorConfig> responseEntity=	
			new RestTemplate().getForEntity("http://localhost:8000/currencyexchange/{from}/To/{to}", CurrencyConvertorConfig.class,uriVariable);
		
		CurrencyConvertorConfig responseBody=responseEntity.getBody();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++"+responseBody.getExchangeCongiuration());
		CurrencyConvertorConfig convertor=
				new CurrencyConvertorConfig(responseBody.getId(), from, to,responseBody.getExchangeCongiuration() , 
						quantity, quantity.multiply(responseBody.getExchangeCongiuration()), responseBody.getPort());
		
		return convertor;
	}

}
