package com.settergetter.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterCorrect {
	private List<String> listTitles;

	public void setListTitles(List<String> titles) {
	    this.listTitles = new ArrayList<String>(titles);
	}
	 
	public List<String> getListTitles() {
	    return new ArrayList<String>(this.listTitles);   
	}

	public static void main(String[] args) {
		CollectionGetterSetterCorrect app = new CollectionGetterSetterCorrect();
		List<String> titles = new ArrayList();
		titles.add("Name");
		titles.add("Address");
		titles.add("Email");
		titles.add("Job");

		app.setListTitles(titles);

		System.out.println("Titles 1: " + titles);

		titles.set(2, "Habilitation");

		System.out.println("Titles 2: " + app.getListTitles());

		titles.set(0, "Full name");

		System.out.println("Titles 3: " + app.getListTitles());

	}

}