package com.yjs3509.main.lists;

import java.util.LinkedList;

import com.yjs3509.domain.fruits.Apple;

public class DriverLinkedList {

	
	public static void main(String[] args) {
		
		
		LinkedList<Apple> apples = new LinkedList<Apple>();
		
		for(int i = 0; i < 5; i ++) {
			apples.add(new Apple());
		}
		System.out.println(apples);
	}
}
