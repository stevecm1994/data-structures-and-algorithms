package datastructures.hashtable.algorithms;

import java.util.HashMap;

public class FirstRecurringCharacter {

	// Google Question
	// Given an array = [2,5,1,2,3,5,1,2,4]:
	// It should return 2

	// Given an array = [2,1,1,2,3,5,1,2,4]:
	// It should return 1

	// Given an array = [2,3,4,5]:
	// It should return null

	// Given an array = [2,5,5,2,3,5,1,2,4]
	// It should return 5 .. 
	// This give different results in findFirstRecurringInteger(int[] array) and
	// findFirstRecurringIntegerNotEfficeint(int[] array)

	public static Integer findFirstRecurringInteger(int[] array) {

		HashMap<Integer, Integer> lookup = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			if (lookup.containsKey(array[i])) {
				return lookup.get(array[i]);
			} else {
				lookup.put(array[i], array[i]);
			}
		}
		return null;
	}// O(n) - time complexity , O(n)-- space complexity

	public static Integer findFirstRecurringIntegerNotEfficeint(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return array[i];
				}
			}
		}
		return null;
	} // O(n^2) - time complexity becuase nested for loop , O(1)-- space complexity

	public static void main(String[] args) {
		int[] arr = { 2, 5, 5, 2, 3, 5, 1, 2, 4 };
		Integer op = findFirstRecurringInteger(arr);
		System.out.println(op);
	}

}
