package com.yjs3509.domain.fruits;

public class Apple {
	private static long counter;
	private final long id = counter++;
	
	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Apple #"+ id;
	}
	
	
}
