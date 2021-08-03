package datastructures.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListImpl {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee("steve1994", "Steve Mathews");
		Employee emp2 =  new Employee("dion1996", "Dion Mathews");
		Employee emp3 =  new Employee("della1962", "Della Mathews");
		Employee emp4 =  new Employee("mathews1962", "C A Mathews");
		Employee emp5 =  new Employee("hari1995", "Hari Govind");
		
		/*
		 * ArrayList is the array implementation of List interface
		 * Normally default size of array assigned for arryList is 10 and 
		 * the backed array is resized according to the new requirement.
		 * So because of resizing the time complexity for add() method may increase for arrayList
		 * ArrayList is not synchronized ie not thread safe
		 * If the project doesn't require thread safety use arrayList to avoid unnecessary overhead 
		 * 
		 * */
		List<Employee> arrayList = new ArrayList<>();
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);
		arrayList.add(emp4);
		System.out.println("****Array List*****");
		arrayList.forEach(employee -> System.out.println(employee));
		
		/*
		 * Vector also array implementation of List interface
		 * Vector is thread safe and have an extra overhead and slowness due to that
		 * 
		 * */
		
		List<Employee> vector = new Vector<>();
		vector.add(emp1);
		vector.add(emp2);
		vector.add(emp3);
		vector.add(emp4);
		System.out.println("****Vector****");
		vector.forEach(employee -> System.out.println(employee));
		
		

	}

}
