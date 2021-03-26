package com.yjs3509.main.exercises;


import com.yjs3509.domain.util.StackImpl;

public class DriverStackImpl {

	public static void main(String[] args) {
		StackImpl<Integer> stack = new StackImpl<Integer>();
		
		System.out.println(stack.empty());
//		System.out.println(stack.pop()); // THROWS NO SUCH ELEMENT EXCEPTION
		stack.push(1);
		stack.push(2);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		
	}
}
