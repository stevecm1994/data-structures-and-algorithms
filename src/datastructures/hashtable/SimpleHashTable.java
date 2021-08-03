package datastructures.hashtable;

public class SimpleHashTable {

	/*
	 * HashMap implementation using Arrays Usually in Arrays we have indexes like
	 * 0,1,2 and so on , here this is an implementation of hashMap using Arrays
	 * under it .They key we input is turned turned into a suitable array index value
	 * using hash(String key) function. Then we store the Key and value we input
	 * into the Array index we obtained using hash function
	 * 
	 * HashCollision : In this implemented scenario , we will have hash collisions
	 * HashCollision means , consider we define our hashmap size as 2 and when we
	 * input ("oranges","100") , we get an array index location as 1 for the key
	 * oranges then if we again input ("apples","20") , we might get Array index
	 * location as 1 again , so this will erase the previous data we stored in index
	 * location 1 which is ("oranges","100") . This is hashmap collision and should be resolved by modifying set and get method.
	 * In larger scenario hashing function should be efficient enough to avoid collision
	 * 
	 */

	Employee[] data;

	SimpleHashTable(int size) {
		data = new Employee[size];
	}

	private int hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + Character.codePointAt(key, i) * i) % this.data.length;
		}
		return hash;
	} //O(1)

	public void put(String key, Employee value) {

		int index = hash(key);
		if (this.data[index] != null) {
			System.out.println("Sorry position in the array is already occupied at "+ index + " for the key " + key );
		}else {
			this.data[index] = value;
		}
	} //O(1)

	public Employee get(String key) {
		int index = hash(key);
		if (this.data[index] != null) {
			return this.data[index];
		} else {
			return null;
		}

	} //O(1)
	
	public void print() {
		for(int i=0;i<this.data.length;i++) {
			if(this.data[i] != null) {
				System.out.println("Data at index : " + i + "----->" + this.data[i]);
			}
			else {
				System.out.println("Data at index : " + i + "-----> empty");
			}
		}
	}

}
