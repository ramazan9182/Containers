package com.yjs3509.main;

import java.util.Arrays;

import com.yjs3509.domain.fruits.Apple;

/**
 * 
 * (!)Abstract Data Types -- ADTs
 * Containers
 * Collections
 * 
 * in package java.util
 * 
 * @author ondersh
 *
 */

public class Driver {

	public static void main(String[] args) {
		
		// ARRAYs
		
		/**
		 * List
		 * Set
		 * Queue
		 * Map
		 * 
		 */
		
		 Object[] objs = {};
		 // Object[] objs1 = new Object[-10];
		 // objs1[0] = new Apple();
		
		 System.out.println(objs.length);
		
		// Object[] objects = new Object[4];
		
		Apple[] apples = new Apple[5];
		apples[0] = new Apple();
		
		//apples[1] = new Orange();
		
		 System.out.println(Arrays.toString(apples)); // Arrays UTILITY CLASS (!)
		
	}
}
