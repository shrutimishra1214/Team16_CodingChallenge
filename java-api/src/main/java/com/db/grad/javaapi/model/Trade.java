package com.db.grad.javaapi.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="trade")

public class Trade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;
	private Long tid;
	private Long book_id;
	private Long counterparty_id;
	private Long quantity;
	private String Status;
	private Long price;
	private String buy_sell;
	private String trade_date;
	private String settlement_date;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Counterparty cp;
	
	public Counterparty getCp() {
		return cp;
	}

	public void setCp(Counterparty cp) {
		this.cp = cp;
	}

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getBook_id() {
		return book_id;
	}

	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}

	public Long getCounterparty_id() {
		return counterparty_id;
	}

	public void setCounterparty_id(Long counterparty_id) {
		this.counterparty_id = counterparty_id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getBuy_sell() {
		return buy_sell;
	}

	public void setBuy_sell(String buy_sell) {
		this.buy_sell = buy_sell;
	}

	public String getTrade_date() {
		return trade_date;
	}

	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}

	public String getSettlement_date() {
		return settlement_date;
	}

	public void setSettlement_date(String settlement_date) {
		this.settlement_date = settlement_date;
	}
	
}
