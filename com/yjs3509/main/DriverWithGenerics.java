package com.yjs3509.main;

import java.util.ArrayList;
import java.util.Iterator;

import com.yjs3509.domain.fruits.Apple;
import com.yjs3509.domain.fruits.Orange;

public class DriverWithGenerics {

	
	public static void main(String[] args) {
		
		
		ArrayList<Apple> apples = new ArrayList<Apple>();
		
		for (int i = 0; i < 5; i++) {
			apples.add(new Apple());
			
		}
		Iterator<Apple> iterator = apples.iterator(); 
		  
        while (iterator.hasNext()) { 
            Apple element = iterator.next(); 
            System.out.println(element); 
        } 
		
//		 apples.add(new Orange()); // DO NOT COMPILE
		
		
		for(Apple apple : apples) {
			System.out.println(apple.getId());
		}
		
	}
}
