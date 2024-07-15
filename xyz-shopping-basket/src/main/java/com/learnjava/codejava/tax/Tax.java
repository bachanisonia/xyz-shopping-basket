package com.learnjava.codejava.tax;

public enum Tax {

	BOOK_TAX(0.0, 0.0) {
	},
	CD_TAX(0.10, 0.05) {
		
		@Override
		public Boolean isTaxable() {
			return true;
		} 
		
		@Override
		public Boolean isImported() {
			return true;
		}
		
	},
	COSMETICS_TAX(0.10, 0.05) {
		
		@Override
		public Boolean isTaxable() {
			return true;
		} 
		
		@Override
		public Boolean isImported() {
			return true;
		} 
	};
	
	private double salesTax;
	private double importTax;
	
	public double getImportTax() {
		return importTax;
	}

	public void setImportTax(double importTax) {
		this.importTax = importTax;
	}

	public Boolean isTaxable() { return false; }
	public Boolean isImported() { return false; }
	

	Tax(double salesTax, double importTax) {
		this.salesTax = salesTax;
		this.importTax = importTax;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(int salesTax) {
		this.salesTax = salesTax;
	}
	
	
	
}
