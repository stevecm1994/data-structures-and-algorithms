package datastructures.hashtable;

/*
 * 
 * Load factor = (number of data to be inserted/internal array space)
 * If Load factor is very high then more chance of collision
 * If Load factor is very low then bad memory allocation
 *  
 * 
 * HashCollision handled using Linear Probing
 * While putting the data to array , if the array index already have a data 
 * the linear probing will start by searching by incrementing the index by 1 to find the empty space to put data.
 * Similarly while getting data , if the given key does not match with the key of data due to collision then 
 * linear probing is done by incrementing the index by 1 to find the correct key and data.
 * 
 * If Load factor is very high then put and get data complexity get worse --> can be even O(n)
 * 

 * 
 * */

public class HashTableWithLinearProbing {

	EmployeeWithKey[] data;

	HashTableWithLinearProbing(int size) {
		data = new EmployeeWithKey[size];
	}

	private int hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + Character.codePointAt(key, i) * i) % this.data.length;
		}
		return hash;
	} // O(1)

	public Employee get(String key) {
		int index = findKey(key);
		if (index != -1) {
			return this.data[index].employee;
		} else {
			return null;
		}

	} // O(n) -- > Worst Case

	public void put(String key, Employee value) {
		int index = hash(key);
		System.out.println("Index Before probing : " + index);
		if (isOccupied(index)) {
			int stopIndex = index;
			if (index == this.data.length - 1) {
				index = 0;
			} else {
				index++;
			}
			while (isOccupied(index) && stopIndex != index) {
				index = (index + 1) % this.data.length;
			}
		}
		if (!isOccupied(index)) {
			System.out.println("Index : " + index + "----> Value : " + value);
			this.data[index] = new EmployeeWithKey(key, value);
		} else {
			System.out.println("Sorry position in the array is already occupied at " + index + " for the key " + key);
		}
	} // O(n) -- > Worst Case

	public void delete(String key) {
		int index = findKey(key);
		if (index != -1) {
			this.data[index] = null;
		}
	} // O(n) -- > Worst Case

	private int findKey(String key) {
		int index = hash(key);
		if (this.data[index] != null && this.data[index].key.equals(key)) {
			return index;
		}

		int stopIndex = index;
		if (index == this.data.length - 1) {
			index = 0;
		} else {
			index++;
		}
		while (index != stopIndex /* && this.data[index] != null && !this.data[index].key.equals(key) */) {

			// index = (index + 1) % this.data.length;
			// Above code commented and below implemented because after deleting a data
			// "this.data[index] != null" will make the findKey stop before completion
			
			if (this.data[index] != null && this.data[index].key.equals(key)) {
				break;
			} else {
				index = (index + 1) % this.data.length;
			}
		}

		if (this.data[index] != null && this.data[index].key.equals(key)) {
			return index;
		} else {
			return -1;
		}

	}

	private boolean isOccupied(int address) {
		if (this.data[address] != null) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		for (int i = 0; i < this.data.length; i++) {
			if (this.data[i] != null) {
				System.out.println("Data at index : " + i + "----->" + this.data[i].employee);
			} else {
				System.out.println("Data at index : " + i + "-----> empty");
			}
		}
	}
}
