package datastructures.list.linkedlist;

import datastructures.list.Employee;

public class LinkedListEmployeeNode {
	
	private Employee employee;
	private LinkedListEmployeeNode next;
	
	public LinkedListEmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LinkedListEmployeeNode getNext() {
		return next;
	}

	public void setNext(LinkedListEmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + "]";
	}

}
