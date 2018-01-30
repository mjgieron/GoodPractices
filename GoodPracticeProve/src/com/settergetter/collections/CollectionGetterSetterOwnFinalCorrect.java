package com.settergetter.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterOwnFinalCorrect {
	private List<FinalPerson> listPeople = new ArrayList<FinalPerson>();

	public void setListPeople(List<FinalPerson> titles) {
		this.listPeople = new ArrayList<FinalPerson>(titles);
	}

	public List<FinalPerson> getListPeople() {
		return new ArrayList<FinalPerson>(this.listPeople);
	}

	public static void main(String[] args) {
		CollectionGetterSetterOwnFinalCorrect app = new CollectionGetterSetterOwnFinalCorrect();
		List<FinalPerson> titles = new ArrayList();
		titles.add(new FinalPerson("Peter"));
		titles.add(new FinalPerson("Alice"));
		titles.add(new FinalPerson("Mary"));

		app.setListPeople(titles);

		System.out.println("Titles 1: " + titles);

		titles.get(2).setName("Maryland");  

		System.out.println("Titles 2: " + app.getListPeople());

		titles.get(0).setName("Peter Crouch"); 

		System.out.println("Titles 3: " + app.getListPeople());

	}

}