package com.yjs3509.domain.util;

import java.util.LinkedList;

public class StackImpl<T> implements Stack<T> {
	
	private LinkedList<T> data = new LinkedList<T>();

	@Override
	public void push(T value) {
		data.addFirst(value);
	}

	@Override
	public T peek() {
		return data.getFirst();
	}

	@Override
	public T pop() {
		return data.removeFirst();
	}

	@Override
	public boolean empty() {
		return data.isEmpty();
	}

}
