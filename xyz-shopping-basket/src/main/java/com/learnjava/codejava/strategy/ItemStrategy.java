package com.learnjava.codejava.strategy;

public interface ItemStrategy {

	static final int LENGTH = 15;
	static final String STARTING_CHAR = "S";
	
	boolean check(String name);
	
	static ItemStrategy nameLengthCheckerLongerThan15() {
		return name -> name.length() > LENGTH;
	}
	
	static ItemStrategy itemNameStartsWithS() {
		
		return name -> name.startsWith(STARTING_CHAR);
	}
	
}
