package com.bae;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<String> sandwiches = new ArrayList<String>();

		sandwiches.add("Ham butty");
		sandwiches.add("Bacon butty");
		sandwiches.add("Sausage butty");
		sandwiches.add("Cheese butty");
		sandwiches.add("Fishfinger butty");

		System.out.println(sandwiches);
		System.out.println(sandwiches.get(2));
		sandwiches.set(3, "Egg butty");
		System.out.println(sandwiches);

		for (int i = 0; i < sandwiches.size(); i++) {
			System.out.println(sandwiches.get(i));
		}

		for (String sandwich : sandwiches) {
			System.out.println(sandwich);
		}

		sandwiches.remove(4);

		System.out.println(sandwiches);

		Collections.sort(sandwiches);

		System.out.println(sandwiches);

	}

}
