package com.yjs3509.main;

import java.util.ArrayList;

import com.yjs3509.domain.fruits.Apple;
import com.yjs3509.domain.fruits.Orange;

public class DriverWithoutGenerics {

	public static void main(String[] args) {
		// ArrayList
		

		ArrayList apples = new ArrayList();

		for (int i = 0; i < 5; i++) {
			apples.add(new Apple());
		}

		// ....

		apples.add(new Orange());

		// ....
		
		displayApples(apples);



//		System.out.println(apples);

	}
	
	
	public static void displayApples(ArrayList apples) {
		
		for (int i = 0; i < apples.size(); i++) {
		if(apples.get(i) instanceof Apple) {}
			System.out.println(((Apple) (apples.get(i))).getId());
			
		}
	}
	
	
	public static void addAppleToList(ArrayList apples,Apple apple) {
		apples.add(apple);
	}
}
