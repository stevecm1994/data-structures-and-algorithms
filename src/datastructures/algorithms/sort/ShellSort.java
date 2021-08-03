package datastructures.algorithms.sort;

public class ShellSort {
	
	/*
	 * This basically insertion but by introducing gap we reduce the swapping
	 * In the first for loop when gap becomes 1 , it turn out to be a normal insertion sort.
	 * Gap only does some preliminary work so as to reduce the swapping when gap =1
	 * Worst case time complexity = O(n*n)
	 * 
	 * */
	
	public static void solution(int [] nums) {
		
		for(int gap = nums.length/2 ; gap>0;gap/=2) {			
			for(int i = gap ; i<nums.length;i++) {
				int keyElement = nums[i];
				int j = i;				
				while(j>=gap && nums[j-gap]>keyElement) {
					nums[j] = nums[j-gap];
					j=j-gap;
				}
				nums[j] = keyElement;
			}
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
