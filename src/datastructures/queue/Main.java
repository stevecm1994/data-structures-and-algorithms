package datastructures.queue;


public class Main {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee("steve1994", "Steve Mathews");
		Employee emp2 =  new Employee("dion1996", "Dion Mathews");
		Employee emp3 =  new Employee("della1962", "Della Mathews");
		Employee emp4 =  new Employee("mathews1962", "C A Mathews");
		Employee emp5 =  new Employee("hari1995", "Hari Govind");	
		
		ArrayQueue arrayQueue = new ArrayQueue(10);
		arrayQueue.add(emp1);
		arrayQueue.add(emp2);
		arrayQueue.add(emp3);
		arrayQueue.add(emp4);
		arrayQueue.print();
		System.out.println("Rmoved from Queue : " + arrayQueue.remove());
		System.out.println("*** After removing from Queue ***");
		arrayQueue.print();
		
		
		
		
		
	}

}
