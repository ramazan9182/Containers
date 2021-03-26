package com.yjs3509.main.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DriverMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < 10; i++) {
			map.put(i, i * 10);
		}
		
		map.put(1,45);
		
		System.out.println(map);
		
		//....
		
		Integer value = map.get(4);
		
		System.out.println(value);
		
		Set< Map.Entry<Integer,Integer> > entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(map.containsKey(100));
		
		

	}
}
