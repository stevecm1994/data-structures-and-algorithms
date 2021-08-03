package datastructures.algorithms.sort;

public class SelectionSort {
	
	/*
	 * In Place algorithm
	 * O(n*n) - complexity - quadratic
	 * Doesn't require much swapping as bubble sort
	 * Unstable Algorithm
	 * */
	
	// Solution sorting from Right to Left
	public static void solution2(int nums[]) {
		
		for(int lastUnsortedIndex = nums.length-1 ; lastUnsortedIndex > 0;lastUnsortedIndex--) {
			int maxIndex = 0;
			for(int j = 1 ; j<=lastUnsortedIndex;j++) {
				if(nums[maxIndex]<nums[j]) {
					maxIndex = j;
				}
			}
			int temp = nums[lastUnsortedIndex];
			nums[lastUnsortedIndex] = nums[maxIndex];
			nums[maxIndex] = temp;			
		}
		
	}
	
	// Solution sorting from Left to right
	public static void solution(int nums[]) {
		for(int i = 0 ; i<nums.length-1;i++) {
			int minIndex = i;
			for(int j =i+1; j<nums.length;j++) {				
				if(nums[minIndex] > nums[j]) {
					minIndex = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
	}
	
	
	public static void main(String[] args) {
			
			int nums[] = {3,6,7,-9,34,7,5,5,100,-30};
			solution(nums);
			for(int i = 0; i<nums.length;i++) {
				System.out.println(nums[i]);
			}
			
		}

}
