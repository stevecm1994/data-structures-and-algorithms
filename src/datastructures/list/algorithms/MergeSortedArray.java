package datastructures.list.algorithms;

public class MergeSortedArray {

	public static int [] mergeSortedArrayMethod1(int array1[] , int array2[])  {		
		int [] finalArray = new int [array1.length + array2.length];
		int array1Counter = 0;
		int array2Counter = 0;
		
		
		while(array1Counter < array1.length || array2Counter <array2.length) {				
			
			if(array1Counter == array1.length) {				
				finalArray[array1Counter+array2Counter] = array2[array2Counter];
				array2Counter++;
				continue;
			}
			if(array2Counter == array2.length) {
				finalArray[array1Counter+array2Counter] = array1[array1Counter];
				array1Counter++;
				continue;
			}
			if(array1[array1Counter] > array2[array2Counter]) {
					finalArray[array1Counter+array2Counter] = array2[array2Counter];
					array2Counter++;
				}else {
					finalArray[array1Counter+array2Counter] = array1[array1Counter];
					array1Counter++;
				}
			
		}	
		return finalArray;		
	}
	public static void main(String[] args) {
		
		int a[] = {4,5,9,11};
		int b[] =  {1,3,6,8 ,10};
		int c[] = mergeSortedArrayMethod1(a ,b);
		 
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		 
	 }
}
