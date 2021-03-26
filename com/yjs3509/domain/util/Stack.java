package com.yjs3509.domain.util;

// LAST IN FIRST OUT
public interface Stack<T> {

	void push(T value);
	T peek();
	T pop();
	boolean empty();
}
