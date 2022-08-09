package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counterparty")

public class Counterparty {
	
	@Id
	@Column(name="counterparty_id")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer counterparty_id;
	private String name;

}
