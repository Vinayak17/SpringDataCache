package com.hegde.inventory.serviceImpl;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hegde.inventory.entities.Item;
import com.hegde.inventory.exception.InventoryException;
import com.hegde.inventory.service.IItemService;

public class ItemService implements IItemService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ItemService.class);
	
	@Override
	public boolean createItem(Item item) {
		// TODO Auto-generated method stub
		if(itemSet.contains(item)) {
			LOGGER.error("Item already exists");
			throw new InventoryException("E0012", "Item already exists");
		}
			
		return itemSet.add(item);
	}

	@Override
	public boolean updateItem(BigInteger id, Item item) {
		// TODO Auto-generated method stub
		item.setId(id);
		itemSet.remove(item);
		return itemSet.add(item);
	}

}
