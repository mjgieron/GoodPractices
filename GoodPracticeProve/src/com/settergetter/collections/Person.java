package com.settergetter.collections;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public Object clone() {
	    Person aClone = new Person(this.name);
	    return aClone;
	}


}