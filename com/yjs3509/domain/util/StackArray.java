package com.yjs3509.domain.util;

public class StackArray<T> implements Stack<T> {

	private static final int DEFAULT_CAPACITY = 10; 
	private static final Object[] DEFAULT_STORAGE = {}; 
	private int size;
	private Object[] storage;
	
	
	public StackArray() {	
		this.storage = DEFAULT_STORAGE;
	}
	
	public StackArray(int capacity) {
		this.storage = new Object[capacity];
	}
	
	@Override
	public void push(T value) {
		ensureCapacity();
		storage[size++] = value;
	}

	@Override
	public T peek() {
		return (T)storage[size - 1];
	}

	@Override
	public T pop() {
		// FIXME : throw exception
		T result = null;
		if(!empty()) {
			result = (T)storage[size - 1];
			storage[size--] = null;
		}
		return result;
	}

	@Override
	public boolean empty() {
		return size == 0;
	}
	
	private void ensureCapacity() {
		int newSize = size + 1;
		if(newSize >= storage.length) {
			resizeCapacity();
		}
		
	}
	
	private void resizeCapacity() {
		int newCapacity = storage.length + ( storage.length >> 1);
		if(newCapacity < DEFAULT_CAPACITY) {
			newCapacity = DEFAULT_CAPACITY;
		}
		Object[] newStorage = new Object[newCapacity];
		System.arraycopy(storage, 0, newStorage, 0, storage.length);
		storage = newStorage;
	}
	

}
