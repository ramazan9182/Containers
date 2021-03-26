package com.yjs3509.main.iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class DriverListIterators {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> integers = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			integers.add(i);
		}
		
		
		ListIterator<Integer> listIterator = integers.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		
		listIterator.set(100);
		System.out.println();
		System.out.println(integers);
		
		System.out.println();
		
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		
		System.out.println();
		
		listIterator.next();
		
		listIterator.add(1000);
		
//		listIterator.set(100);
		
//		listIterator.next();
		
//		listIterator.set(400);
//		
//		listIterator.next();
//		
//		listIterator.set(500);
		
//		listIterator.add(200);
		
		System.out.println("After adding 100...");
		
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		System.out.println(integers);
		
	}
}
