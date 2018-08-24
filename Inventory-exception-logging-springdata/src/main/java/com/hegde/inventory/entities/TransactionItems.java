package com.hegde.inventory.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionItems {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private BigInteger id;
	
//	@ManyToOne
//	@JoinColumn(name = "")
//	private Transaction txn;
	
	@Column
	private BigInteger itemId;
	
	@Column
	private int quantity;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
//	public Transaction getTxnId() {
//		return txn;
//	}
//	public void setTxnId(Transaction txn) {
//		this.txn = txn;
//	}
	public BigInteger getItemId() {
		return itemId;
	}
	public void setItemId(BigInteger itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
