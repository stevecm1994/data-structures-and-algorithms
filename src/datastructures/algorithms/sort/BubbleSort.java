package datastructures.algorithms.sort;

public class BubbleSort {
	
	/*
	 * In Place Algorithm
	 * O(n*n) - quadratic
	 * 100 steps - 10 elements
	 * Algorithm degrades with the number of elements
	 * Each element is compared with adjacent element and swapped if the the current element is greater
	 * Thereby after each iteration greatest element bubbles up in the end of array
	 * */
	
	/*
	 * If there is  "=" this will become an unstable sort 
	 * Array = [5 9 3 9- 4]
	 * Unstable Sort = [3 4 5 9- 9] -- > position of the same repeating elements not maintained , 
	 * here 9 and 9- are same but after sorting 9- came before 9 , so its unstable sort.
	 * Stable Sort = [3 4 5 9 9-] -- > Relative position of 9s maintained.
	 * */
	
	public static void solution2(int nums[]) {
		
		for(int i=0 ; i<nums.length;i++) {
			for(int j =i+1;j<nums.length;j++) {
				if(nums[j]<=nums[i]) {                // Significance of = here : see above
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	public static void solution(int nums[]) {		
		for(int lastUnsortedIndex = nums.length-1 ;lastUnsortedIndex > 0;lastUnsortedIndex--) {			
			for(int j =0 ; j < lastUnsortedIndex;j++) {
				if(nums[j]>nums[j+1]) {         // Significance of not putting = here : see above
					int temp = nums[j];
					nums[j] =  nums[j+1];
					nums[j+1] = temp;
				}
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
