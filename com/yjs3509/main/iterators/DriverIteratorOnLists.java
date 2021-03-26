package com.yjs3509.main.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class DriverIteratorOnLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(123);
		integers.add(89);
		
		Iterator<Integer> iterator =  integers.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
