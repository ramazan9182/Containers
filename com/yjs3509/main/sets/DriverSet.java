package com.yjs3509.main.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DriverSet {
	
	public static void main(String[] args) {
		// {  1,3,5  }
		// {  5,1,3  }
		
		List<Integer> integersList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			integersList.add(new Integer(i));
			integersList.add(new Integer(i));
			integersList.add(new Integer(i));
			integersList.add(i); // SAME AS ABOVE (!) -- AUTO-WRAPPING
		}
		
//		System.out.println(integersList);
		
		
		Set<Integer> integers = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			integers.add(i);
			integers.add(i);
			integers.add(i);
			integers.add(i);
		}
		
		System.out.println(integers);
		
	}

}
