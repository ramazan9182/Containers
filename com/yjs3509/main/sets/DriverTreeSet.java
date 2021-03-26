package com.yjs3509.main.sets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DriverTreeSet {

	public static void main(String[] args) {

		Set<Integer> integersSet = new HashSet<Integer>();

		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			integersSet.add(random.nextInt(100));
		}
		
		System.out.println(integersSet);
		
		
		// Lexical Order
		// Natural Logical Order
		integersSet = new TreeSet<Integer>();
		
		for(int i = 0; i < 100; i ++) {
			integersSet.add(random.nextInt(100));
		}
		
		System.out.println(integersSet);
	}
}
