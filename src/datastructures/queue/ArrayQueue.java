package datastructures.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {

	private Employee[] queueArray;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queueArray = new Employee[capacity];
	}

	public void add(Employee employee) {
		if (queueArray.length == back) {
			// resize array
			Employee[] newArray = new Employee[2 * queueArray.length];
			System.arraycopy(queueArray, 0, newArray, 0, queueArray.length);
			queueArray = newArray;
		}

		queueArray[back] = employee;
		back++;
	}

	public Employee remove() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Employee employee = queueArray[front];
		queueArray[front] = null;
		front++;
		if (isEmpty()) {
			front = 0;
			back = 0;
		}
		return employee;
	}

	public boolean isEmpty() {
		return front==back;
	}
	
	public Employee peek() {
		return queueArray[front];
	}
	
	public void print() {
		for(int i=front;i<back;i++) {
			System.out.println(queueArray[i]);
		}
	}

}
