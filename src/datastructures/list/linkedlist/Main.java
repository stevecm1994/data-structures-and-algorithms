package datastructures.list.linkedlist;

import datastructures.list.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee("steve1994", "Steve Mathews");
		Employee emp2 =  new Employee("dion1996", "Dion Mathews");
		Employee emp3 =  new Employee("della1962", "Della Mathews");
		Employee emp4 =  new Employee("mathews1962", "C A Mathews");
		Employee emp5 =  new Employee("hari1995", "Hari Govind");
		
		LinkedListImpl list = new LinkedListImpl();
		System.out.println(list.isEmpty());
		list.addToFront(emp1);
		list.addToFront(emp2);
		list.addToFront(emp3);
		list.addToFront(emp4);
		list.printList();
		System.out.println(list.getSize());
		System.out.println(list.isEmpty());
		
		list.removeFromFront();
		System.out.println("**After reoving from front***");
		list.printList();
		System.out.println(list.getSize());

	}

}
