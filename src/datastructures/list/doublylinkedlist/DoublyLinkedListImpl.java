package datastructures.list.doublylinkedlist;

import datastructures.list.Employee;

public class DoublyLinkedListImpl {

	private DoublyLinkedListEmployeeNode head;
	private DoublyLinkedListEmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		DoublyLinkedListEmployeeNode employeeNode = new DoublyLinkedListEmployeeNode(employee);
		if (isEmpty()) {
			tail = employeeNode;
		} else {
			head.setPrevious(employeeNode);
			employeeNode.setNext(head);
		}
		head = employeeNode;
		this.size++;
	}

	public void addToEnd(Employee employee) {
		DoublyLinkedListEmployeeNode employeeNode = new DoublyLinkedListEmployeeNode(employee);
		if (isEmpty()) {
			head = employeeNode;
		} else {
			tail.setNext(employeeNode);
			employeeNode.setPrevious(tail);
		}
		tail = employeeNode;
		this.size++;
	}

	public Employee removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		DoublyLinkedListEmployeeNode removedEmployee = head;
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		return removedEmployee.getEmployee();

	}

	public Employee removeFromEnd() {

		if (isEmpty()) {
			return null;
		}
		DoublyLinkedListEmployeeNode removedEmployee = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		return removedEmployee.getEmployee();
	}

	public void printList() {
		DoublyLinkedListEmployeeNode currentNode = head;
		System.out.print("Head -- >");
		while (currentNode != null) {
			System.out.print(currentNode);
			System.out.print("<->");
			currentNode = currentNode.getNext();
		}
		System.out.println("null");
	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {

		return head == null;
	}

}
