package datastructures.algorithms;

public class MoveZeros {
	
	/*
	   Given an integer array nums, move all 0's to the end of it while maintaining 
	   the relative order of the non-zero elements.
       Note that you must do this in-place without making a copy of the array.
       Example 1:
       Input: nums = [0,1,0,3,12]
	   Output: 		 [1,3,12,0,0]
	   
	   Example 2:
       Input: nums = [0]
       Output: [0]
	  
	  */
	
	/* Solution using New Array but we need in place editing */
	public static int[] Solution1(int[] nums) {
		int[] finalArray = new int[nums.length];
		int start = 0;
		int end = nums.length-1;
	       for(int i =0 ; i <nums.length;i++){
	           if(nums[i] == 0){               
	        	   finalArray[end] = 0;
	        	   end--;
	           }else{
	              finalArray[start] = nums[i];
	              start++;
	           }
	       }
	        return finalArray;
	}
	
	public static void Solution2(int[] nums) {
		
	}

	public static void main(String[] args) {
		
		int[] input  = new int [] {0} ; 
		int[] op = Solution1(input);
		for(int num : op) {
			System.out.println(num);
		}

	}

}
