package datastructures.list.linkedlist;

import datastructures.list.Employee;

/* The head reference will point to the next object and so on 
 * O(1)  -- to insert in the start position , no reordering required
 * O(n) -- 
 * 
 * */

public class LinkedListImpl {

	private LinkedListEmployeeNode head;
	private int size;

	public void addToFront(Employee employee) {
		LinkedListEmployeeNode employeeNode = new LinkedListEmployeeNode(employee);
		employeeNode.setNext(head);
		head = employeeNode;
		size++;
	}
	
	public Employee removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		Employee removedEmployee = head.getEmployee();
		head = head.getNext();
		size--;
		return removedEmployee;
	}

	public void printList() {
		LinkedListEmployeeNode currentNode = head;
		System.out.print("Head -- >");
		while (currentNode != null) {
			System.out.print(currentNode);
			System.out.print("-->");
			currentNode = currentNode.getNext();
		}
		System.out.println("null");
	}

	public int getSize() {
		return this.size;
	}
	public boolean isEmpty() {
		
		return head == null ;
	}

}
