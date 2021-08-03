package datastructures.list.doublylinkedlist;

import datastructures.list.Employee;

public class DoublyLinkedListEmployeeNode {

	private Employee employee;
	private DoublyLinkedListEmployeeNode next;
	private DoublyLinkedListEmployeeNode previous;
	
	public DoublyLinkedListEmployeeNode (Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public DoublyLinkedListEmployeeNode getNext() {
		return next;
	}
	public void setNext(DoublyLinkedListEmployeeNode next) {
		this.next = next;
	}
	public DoublyLinkedListEmployeeNode getPrevious() {
		return previous;
	}
	public void setPrevious(DoublyLinkedListEmployeeNode previous) {
		this.previous = previous;
	}
	@Override
	public String toString() {
		return "[employee=" + employee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((previous == null) ? 0 : previous.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoublyLinkedListEmployeeNode other = (DoublyLinkedListEmployeeNode) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		return true;
	}
}
