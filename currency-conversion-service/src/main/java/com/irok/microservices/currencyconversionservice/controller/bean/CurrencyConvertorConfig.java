package com.irok.microservices.currencyconversionservice.controller.bean;

import java.math.BigDecimal;

public class CurrencyConvertorConfig {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal exchangeCongiuration;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;
	public CurrencyConvertorConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyConvertorConfig(Long id, String from, String to, BigDecimal exchangeCongiuration, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeCongiuration = exchangeCongiuration;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getExchangeCongiuration() {
		return exchangeCongiuration;
	}
	public void setExchangeCongiuration(BigDecimal exchangeCongiuration) {
		this.exchangeCongiuration = exchangeCongiuration;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
