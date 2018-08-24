package com.hegde.inventory.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hegde.inventory.entities.Item;

@Repository
public interface ItemRepositoy extends JpaRepository<Item, BigInteger> {

}
