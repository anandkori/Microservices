package com.irok.microservices.currencyexchangeservices.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exchange_value")
public class ExchangeValue {
	
	@Id
	private int id;
	
	@Column(name="exchange_from")
	private String from;
	
	@Column(name="exchange_to")
	private String to;
	@Column(name="exchange_congiuration")
	private BigDecimal exchangeCongiuration;
	
	private int port;
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(int id, String from, String to, BigDecimal d) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeCongiuration = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
	

}
