package com.settergetter.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterOwnIncorrect {
	private List<Person> listTitles;

	public void setListTitles(List<Person> titles) {
		this.listTitles = new ArrayList<Person>(titles);
	}

	public List<Person> getListTitles() {
		return new ArrayList<Person>(this.listTitles);
	}

	public static void main(String[] args) {
		CollectionGetterSetterOwnIncorrect app = new CollectionGetterSetterOwnIncorrect();
		List<Person> titles = new ArrayList();
		titles.add(new Person("Peter"));
		titles.add(new Person("Alice"));
		titles.add(new Person("Mary"));

		app.setListTitles(titles);

		System.out.println("Titles 1: " + titles);

		titles.get(2).setName("Maryland");  

		System.out.println("Titles 2: " + app.getListTitles());

		titles.get(0).setName("Peter Crouch"); 

		System.out.println("Titles 3: " + app.getListTitles());

	}

}