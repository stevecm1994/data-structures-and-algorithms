package datastructures.algorithms.sort;

public class MergeSort {
	
	public static int split(int start, int end) {
		
		if(end-start == 0) {
			return start;
		}
		return end;
		
		
		
	}
	
	public static int [] merge(int[] leftArray , int[] rightArray) {
		
		int lengthOfLeftArray = leftArray.length;
		int lengthOfRigtArray = rightArray.length;
		int leftCounter=0;
		int rightCounter =0;
		int []  mergedArray = new int[lengthOfLeftArray+lengthOfRigtArray];
		while(leftCounter < lengthOfLeftArray || rightCounter < lengthOfRigtArray) {
			/*if(leftCounter == lengthOfLeftArray) {
				mergedArray[leftCounter+rightCounter] = rightArray[rightCounter];
				rightCounter++;
				continue;
			}
			if(rightCounter == lengthOfRigtArray) {
				mergedArray[leftCounter+rightCounter] = leftArray[leftCounter];
				leftCounter++;
				continue;
			}*/
			if(leftCounter == lengthOfLeftArray || leftArray[leftCounter] > rightArray[rightCounter]) {
				mergedArray[leftCounter+rightCounter] = rightArray[rightCounter];
				rightCounter++;
			}
			else{
				mergedArray[leftCounter+rightCounter] = leftArray[leftCounter];
				leftCounter++;
			}
		}
		return mergedArray;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {3,6,7,-9,34,7,5,5,-100};
		int leftArray[] = {1,2,3,4,5,10};
		int rightArray[] = {8,9,10};
		int result[] = merge(leftArray ,rightArray);
		for(int i = 0; i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

}
