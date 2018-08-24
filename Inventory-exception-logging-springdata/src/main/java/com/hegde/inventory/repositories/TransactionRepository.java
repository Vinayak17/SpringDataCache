package com.hegde.inventory.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hegde.inventory.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, BigInteger> {

}
