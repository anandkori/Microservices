package com.irok.microservices.currencyexchangeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irok.microservices.currencyexchangeservices.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from,String to);

}
