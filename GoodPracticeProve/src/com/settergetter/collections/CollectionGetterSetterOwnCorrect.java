package com.settergetter.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterOwnCorrect {
	private List<Person> listPeople = new ArrayList<Person>();

    public void setListPeople(List<Person> list) {
        for (Person aPerson : list) {
            this.listPeople.add((Person) aPerson.clone());
        }
    }
 
    public List<Person> getListPeople() {
        List<Person> listReturn = new ArrayList<Person>();
        for (Person aPerson : this.listPeople) {
            listReturn.add((Person) aPerson.clone());
        }
        return listReturn;
    }

	public static void main(String[] args) {
		CollectionGetterSetterOwnCorrect app = new CollectionGetterSetterOwnCorrect();
		List<Person> titles = new ArrayList();
		titles.add(new Person("Peter"));
		titles.add(new Person("Alice"));
		titles.add(new Person("Mary"));

		app.setListPeople(titles);

		System.out.println("Titles 1: " + titles);

		titles.get(2).setName("Maryland");  

		System.out.println("Titles 2: " + app.getListPeople());

		titles.get(0).setName("Peter Crouch"); 

		System.out.println("Titles 3: " + app.getListPeople());

	}

}