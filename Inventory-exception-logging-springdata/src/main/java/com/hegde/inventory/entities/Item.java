package com.hegde.inventory.entities;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private BigInteger id;
	
	@Column
	private String name;
	
	@Column
	private BigDecimal cost;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getId().intValueExact() * 32;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof Item ? getId().equals(((Item)obj).getId()) : false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}

}
