package datastructures.algorithms;

public class Factorial {
	
	/*
	 * If no break case stack overflow error
	 * Even if there is break case , if number is too high , stack overflow error may come
	 * WorkAround for this : Tail Recursion , but this is not used in java 
	 * 
	 * */
	
	public static int factorial (int num) {
		
		if(num == 0) {                        // Called Base Case or breaking condition
			return  1;
		}
		return (num * factorial(num-1));
	}
	
	public static void main(String[] args) {
		
		int num = 5;
		System.out.println(factorial(num));
		
	}

}
