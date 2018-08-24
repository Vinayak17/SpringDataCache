package com.hegde.inventory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hegde.inventory.entities.Item;
import com.hegde.inventory.entities.Transaction;
import com.hegde.inventory.entities.TransactionItems;
import com.hegde.inventory.repositories.ItemRepositoy;
import com.hegde.inventory.repositories.TransactionRepository;

@SpringBootApplication
public class InventoryExceptionLoggingSpringdataApplication implements CommandLineRunner {

	@Autowired
	ItemRepositoy itemRepo;
	
	@Autowired
	TransactionRepository transactionRepo;

	public static void main(String[] args) {
		SpringApplication.run(InventoryExceptionLoggingSpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Item item = new Item();
		item.setName("item 1");
		item.setCost(new BigDecimal(200));

		Item item1 = new Item();
		item1.setName("item 2");
		item1.setCost(new BigDecimal(300));

		Item item2 = new Item();
		item2.setName("item 3");
		item2.setCost(new BigDecimal(500));

		Item item3 = new Item();
		item3.setName("item 4");
		item3.setCost(new BigDecimal(50));

		itemRepo.saveAll(Arrays.asList(item1, item2, item3, item));

		Transaction transactionOne = new Transaction();
		TransactionItems txnItem1 = new TransactionItems();
		TransactionItems txnItem2 = new TransactionItems();
		TransactionItems txnItem3 = new TransactionItems();
		txnItem1.setItemId(itemRepo.getOne(new BigInteger("2")).getId());
		txnItem1.setQuantity(2);

		txnItem2.setItemId(itemRepo.getOne(new BigInteger("3")).getId());
		txnItem2.setQuantity(2);

		txnItem3.setItemId(itemRepo.getOne(new BigInteger("1")).getId());
		txnItem3.setQuantity(2);
		transactionOne.setItems(Arrays.asList(txnItem1, txnItem2, txnItem3));
		transactionOne.setTotal(new BigDecimal("1000.00"));
		
		transactionRepo.save(transactionOne);

	}

}
