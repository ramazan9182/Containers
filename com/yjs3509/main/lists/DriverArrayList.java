package com.yjs3509.main.lists;

import java.util.ArrayList;

import com.yjs3509.domain.fruits.Apple;

public class DriverArrayList {

	public static void main(String[] args) {

		ArrayList<Apple> apples = new ArrayList<Apple>();

		for (int i = 0; i < 5; i++) {
			apples.add(new Apple());
		}

	}
}
