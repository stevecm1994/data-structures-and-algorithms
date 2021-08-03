package datastructures.list.doublylinkedlist;

import datastructures.list.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee("steve1994", "Steve Mathews");
		Employee emp2 =  new Employee("dion1996", "Dion Mathews");
		Employee emp3 =  new Employee("della1962", "Della Mathews");
		Employee emp4 =  new Employee("mathews1962", "C A Mathews");
		Employee emp5 =  new Employee("hari1995", "Hari Govind");
		
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		/*
		 * list.addToFront(emp1); list.addToFront(emp2); list.addToFront(emp3);
		 * list.addToFront(emp4); list.printList(); System.out.println(list.getSize());
		 */
		
		
		list.addToEnd(emp1);
		list.addToEnd(emp2);
		list.addToFront(emp3);
		list.addToEnd(emp4);
		list.addToFront(emp5);
		list.printList();
		System.out.println(list.getSize());
		
		System.out.println("***After Removing from Front");
		list.removeFromFront();
		list.removeFromFront();
		list.printList();
		
		System.out.println("*** After Removing from End");
		list.removeFromEnd();
		list.printList();
	}

}
