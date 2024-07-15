package com.learnjava.codejava;

import java.util.ArrayList;
import java.util.List;

import com.learnjava.codejava.item.Book;
import com.learnjava.codejava.item.Item;

public class XYZShoppingBasket {

	public static void main(String[] args) {

		// Building a Basket
		System.out.println("Building a basket");
		Basket basket = new Basket();
		
		Item book1 = new Book(20.0, "Sudha Murthy", 10);
		Item book2 = new Book(25.0, "Healthy Living", 5);
		
		basket.addItem(book1);
		basket.addItem(book2);
		
		// Printing basket details
		basket.printItems();
		
		List<Item> basketItems = basket.getBasketItems();
		
		System.out.println("Preparing item for retail");
		for(Item item: basketItems) {
			System.out.println("-------------------------");
			item.prepareItemForRetail();
			System.out.println("-------------------------");
		}
		
		System.out.println("Total price of items : " + basket.getTotalPrice());
		System.out.println("Total Price of items after tax : " + basket.getTotalPriceAfterTax());
		System.out.println("Total tax paid on items : " + basket.getTotalTax());
		
	}

}
