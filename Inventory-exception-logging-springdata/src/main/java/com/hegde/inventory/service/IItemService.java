package com.hegde.inventory.service;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import com.hegde.inventory.entities.Item;

public interface IItemService {

	public static final Set<Item> itemSet = new HashSet<Item>();
	
	public boolean createItem(Item item);
	
	public boolean updateItem(BigInteger id, Item item);
}	
