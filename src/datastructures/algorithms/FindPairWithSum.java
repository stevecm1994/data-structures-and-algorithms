package datastructures.algorithms;
import java.util.HashMap;

   /*
	 *   
	 *   Find if any pairs in the array add up to the sum
	 *   a = [1,2,3,4,5] , sum = 7  , yes(3,4)
	 *   a = [1,2,3,4,5] , sum = 10  , No
	 * 
	 * 
	 * */

public class FindPairWithSum {

	// This method have O(n*n) time consumption
	public static int[] findPairNaiveMethod(int[] array , int sum) {		
		for(int i = 0; i< array.length ; i++) {
			for(int j = i+1; j < array.length ; j++) {
				if(array[i]+array[j] == sum) {
					return new int[] {i,j};
				}
			}
		}		
		 return  new int[]{};
	}
	
	/* This method with the tradeoff in space complexity , time complexity is linear now O(n)
	   More efficient because of less time complexity 	   
	   */
	
	public static int[] findPairOptimizedMethod(int [] array , int sum) {
		HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i=0; i<array.length;i++){            
            if(map.containsKey(array[i])){
              return  new int[]{map.get(array[i]),i};
            }
            map.put( sum-array[i], i);
        }
        return  new int[]{};
		
	}
	
	 public static void main(String[] args) {		 
		 int[] arr = {1, 5, 6, 8, 9, 4};
		 int sum = 5;
		 int[] op = findPairOptimizedMethod(arr,sum);
		 System.out.println(op[0] + "," + op[1]);
	 }
	
	
}
