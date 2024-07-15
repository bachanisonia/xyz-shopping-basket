package com.learnjava.codejava.item;

public interface Item {

	public boolean isTaxable();
	public boolean isImported();
	public double getPrice();
	public double getTotalPrice();
	public double getPriceAfterTax();
	public double getTotalTax();
	public void printItemDetails();
	
	public default void prepareItemForRetail() {
		addToStock();
		applyBarcode();
		markRetailPrice();
	}
	
	void addToStock();
	void applyBarcode();
	void markRetailPrice();
	
}
