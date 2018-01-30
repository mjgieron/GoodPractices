package com.settergetter.collections;

class FinalPerson {
	private final String name;

	public FinalPerson(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public Object clone() {
		FinalPerson aClone = new FinalPerson(this.name);
	    return aClone;
	}
}