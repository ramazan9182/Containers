package com.yjs3509.main.sets;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DriverLinkedHashSet {

	
	public static void main(String[] args) {
		
		
		Set<Integer> integersSet = new TreeSet<Integer>();
		Random random = new Random();
		
		for(int i = 0; i < 100; i++) {
			integersSet.add(random.nextInt(100));
		}
		
		System.out.println(integersSet);
		
		integersSet = new LinkedHashSet<Integer>();
		
		// Insertion Order
		
		for(int i = 0;i < 100; i++) {
			integersSet.add(random.nextInt(100));
		}
		
		System.out.println(integersSet);
		
	}
	
}
