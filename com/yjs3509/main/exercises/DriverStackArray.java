package com.yjs3509.main.exercises;

import com.yjs3509.domain.util.StackArray;

public class DriverStackArray {

	
	public static void main(String[] args) {
		
		StackArray<Integer> numbers = new StackArray<Integer>();
		
		System.out.println(numbers.empty());
		
		numbers.push(1);
		numbers.push(2);
		
		System.out.println(numbers.empty());
		
		System.out.println(numbers.peek());
		
		System.out.println(numbers.empty());
		
		System.out.println(numbers.pop());
		
	}
}
