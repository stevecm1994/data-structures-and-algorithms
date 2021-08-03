package datastructures.algorithms.sort;

public class InsertionSort {
	
	/*
	 * Takes each element and insert into the sorted partition in the left in the correct place
	 * In - Place algorithm
	 * O(n*n)
	 * Stable sorting
	 * 
	 * */
	
	public static void solution(int nums[]) {
		
		for(int firstUnsortedIndex = 1 ; firstUnsortedIndex <nums.length;firstUnsortedIndex++) {
			int j ; 
			int keyElement = nums[firstUnsortedIndex];
			for(j =firstUnsortedIndex ; j>0 && nums[j-1]>keyElement;j-- ) {
				nums[j] = nums[j-1];
			}
			nums[j] = keyElement;
		}
	}
	public static void main(String[] args) {
		
		int nums[] = {3,6,7,-9,34,7,5,5,-100};
		solution(nums);
		for(int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}

}
