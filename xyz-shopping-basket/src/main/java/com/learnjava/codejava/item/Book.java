package com.learnjava.codejava.item;

import com.learnjava.codejava.strategy.ItemStrategy;
import com.learnjava.codejava.tax.Tax;

public class Book implements Item {

	private ItemType itemType;
	private double price;
	
	public double getTotalPrice() {
		return this.price*this.qty;
	}

	private String name;
	private int qty;
	private Tax tax;
	
	public Book(double price, String name, int qty) {
		this.price = price;
		this.name = name;
		this.qty = qty;
		this.itemType = ItemType.BOOK;
		this.tax = Tax.BOOK_TAX;
	}

	@Override
	public double getPrice() {
		// return the price of book 
		return this.price;
	}

	@Override
	public double getPriceAfterTax() {
		
		if (isTaxable()) {
			return ( ( price* (this.tax.getSalesTax() + this.tax.getImportTax()) ) + price) * qty;
		}
		else {
			return price*qty;
		}
		
	}

	
	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}


	@Override
	public boolean isTaxable() {
		return this.tax.isTaxable();
	}

	@Override
	public boolean isImported() {
		return false;
	}

	@Override
	public double getTotalTax() {
		
		if (this.tax.isTaxable()) {
			return ( this.price * (this.tax.getSalesTax() + this.tax.getImportTax()) )*qty;
		}
		else {
			return 0.0;
		}
	}

	@Override
	public void printItemDetails() {
		
		if (ItemStrategy.nameLengthCheckerLongerThan15().check(this.getName()) )
		{
			System.out.println("Too long");
		}
		else {
			System.out.println(this.getName() + "   " + this.getPrice() + "   " + this.getQty() + "   " + this.getTotalPrice());
		}
	}

	@Override
	public void addToStock() {
		System.out.println(this.itemType + " - Added to the stock");
	}

	@Override
	public void applyBarcode() {
		System.out.println(this.itemType + " - Applied the Barcode");
	}

	@Override
	public void markRetailPrice() {
		System.out.println(this.itemType + " - Marked the retail price");
	}
	
}
