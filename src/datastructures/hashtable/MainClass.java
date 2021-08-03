package datastructures.hashtable;

public class MainClass {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee("steve1994", "Steve Mathews");
		Employee emp2 =  new Employee("dion1996", "Dion Mathews");
		Employee emp3 =  new Employee("della1962", "Della Mathews");
		Employee emp4 =  new Employee("mathews1962", "C A Mathews");
		Employee emp5 =  new Employee("hari1995", "Hari Govind");
		
		/*
		 * 
		SimpleHashTable simpleHashTable = new SimpleHashTable(6);		
		simpleHashTable.put(emp1.getId(),emp1);
		simpleHashTable.put(emp2.getId(),emp2);
		System.out.println("Employee record of " +  emp1.getId() + "---->" + simpleHashTable.get(emp1.getId()));
		System.out.println("Employee record of " +  emp2.getId() + "---->" + simpleHashTable.get(emp2.getId()));
		simpleHashTable.print(); 
		*
		*/
		
		/*
		HashTableWithLinearProbing hashTableWithLinearProbing = new HashTableWithLinearProbing(6);
		hashTableWithLinearProbing.put(emp1.getId(),emp1);
		hashTableWithLinearProbing.put(emp2.getId(),emp2);
		hashTableWithLinearProbing.put(emp3.getId(),emp3);
		hashTableWithLinearProbing.put(emp4.getId(),emp4);
		hashTableWithLinearProbing.put(emp5.getId(),emp5);
				
		hashTableWithLinearProbing.print();
		
		hashTableWithLinearProbing.delete("mathews1962");
		
		System.out.println("-------------After deleting-----------");
		
		hashTableWithLinearProbing.print();
		
		System.out.println("Employee record of " +  emp5.getId() + "---->" + hashTableWithLinearProbing.get(emp5.getId()));
		
		*/
		
		
		ChainedHashtable chainedHashtable = new ChainedHashtable(6);
		chainedHashtable.put(emp1.getId(),emp1);
		chainedHashtable.put(emp2.getId(),emp2);
		chainedHashtable.put(emp3.getId(),emp3);
		chainedHashtable.put(emp4.getId(),emp4);
		chainedHashtable.put(emp5.getId(),emp5);
		
		chainedHashtable.print();
		
		chainedHashtable.delete("hari1995");
		System.out.println("----After removing a item----");
		chainedHashtable.print();
		
		System.out.println("Employee record of " +  emp3.getId() + "---->" + chainedHashtable.get(emp3.getId()));
		
		
		
		
		
		
		
		
	}

}
