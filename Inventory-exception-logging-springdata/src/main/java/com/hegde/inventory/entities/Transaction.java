package com.hegde.inventory.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tnx_id")
	private List<TransactionItems> items;
	
	@Column
	private BigDecimal total;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public List<TransactionItems> getItemId() {
		return items;
	}

	public void setItems(List<TransactionItems> items) {
		this.items = items;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<TransactionItems> getItems() {
		return items;
	}
}
