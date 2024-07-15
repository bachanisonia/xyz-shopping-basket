package com.learnjava.codejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.learnjava.codejava.item.Item;

public class Basket {

	List<Item> basketItems;
	
	public Basket() {
		if (basketItems == null) {
			basketItems = new ArrayList<>();
		}
		else {
			basketItems = null;
			basketItems = new ArrayList<>();
		}
	}

	public List<Item> getBasketItems() {
		return basketItems;
	}

	public void setBasketItems(List<Item> basketItems) {
		this.basketItems = basketItems;
	}
	
	public void addItem(Item item) {
		this.basketItems.add(item);
	}
	
	public double getTotalPrice() {
		return this.getBasketItems().stream().mapToDouble(Item::getTotalPrice).sum();
	}

	public double getTotalPriceAfterTax() {
		return this.getBasketItems().stream().mapToDouble(Item::getPriceAfterTax).sum();
	}

	
	public double getTotalTax() {
		return this.getBasketItems().stream().mapToDouble(Item::getTotalTax).sum();
	}

	public void printItems() {
		
		System.out.println("Basket Items");
		System.out.println("=====================");
		
		for(Item item:basketItems) {
			item.printItemDetails();
		}
	}
	
}
