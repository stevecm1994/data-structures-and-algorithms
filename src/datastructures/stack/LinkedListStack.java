package datastructures.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack {
	
	LinkedList<Employee> stack ;
	
	public LinkedListStack() {
		stack = new LinkedList<Employee>();
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void print() {
		Iterator<Employee> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
