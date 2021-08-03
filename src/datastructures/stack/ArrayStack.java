package datastructures.stack;

import java.util.EmptyStackException;

public class ArrayStack {

	private Employee[] stack;
	private int top;

	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	public void push(Employee employee) {
		if (stack.length == top) {
			// resize the backing array
			Employee[] newStack = new Employee[2 * top];
			System.arraycopy(stack, 0, newStack, 0, top);
			stack = newStack;
		}
		stack[top] = employee;
		top++;
	}

	public Employee pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		Employee poppedEmployee = stack[top - 1];
		stack[top - 1] = null;
		top--;
		// can resize array if required after popping
		return poppedEmployee;
	}

	public Employee peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return stack[top - 1];
	}
	
	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}
	
	public void print() {
		for(int i=0;i<top;i++) {
			System.out.println(stack[i]);
		}
	}

}
