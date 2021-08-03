package datastructures.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

	private LinkedList<EmployeeWithKey>[] data;

	public ChainedHashtable(int size) {
		data = new LinkedList[size];
		for (int i = 0; i < size; i++) {
			data[i] = new LinkedList<EmployeeWithKey>();
		}
	}

	public void put(String key, Employee value) {
		int index = hash(key);
		data[index].add(new EmployeeWithKey(key, value));
	}

	public Employee get(String key) {
		int index = hash(key);
		ListIterator<EmployeeWithKey> iterator = data[index].listIterator();
		EmployeeWithKey employeeWithKey = null;
		while (iterator.hasNext()) {
			employeeWithKey = iterator.next();
			if (employeeWithKey.key.equals(key)) {
				return employeeWithKey.employee;
			}
		}
		return null;
	} // Worst Case O(n) due to bad hashing algorithm

	public void delete(String key) {
		int index = hash(key);
		ListIterator<EmployeeWithKey> iterator = data[index].listIterator();
		EmployeeWithKey employeeWithKey = null;
		int listindex = 0;
		while (iterator.hasNext()) {
			employeeWithKey = iterator.next();
			if (employeeWithKey.key.equals(key)) {
				data[index].remove(employeeWithKey);
				break;
			}
			listindex++;
		}		
	} // Worst Case O(n) due to bad hashing algorithm
	
	public void print() {
		
		for(int i =0 ; i<data.length;i++) {
			
			if(data[i].isEmpty()) {
				System.out.println("Item at index : " + i + " = empty");
			}
			else {
				ListIterator<EmployeeWithKey> iterator = data[i].listIterator();
				System.out.println("Item at index : " + i + " = ");
				while(iterator.hasNext()) {					
					System.out.print(iterator.next().employee + "-->");
				}
				System.out.println("tail");
			}
		}
	}

	private int hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + Character.codePointAt(key, i) * i) % this.data.length;
		}
		return hash;
	} // O(1)
}
