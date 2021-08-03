package datastructures.list.algorithms;

public class ReverseString {

	public static String reverseStringMethod1(String inputString) {		
		
		int length = inputString.length();
		char[] reversedInputStringCharArray  = new char[length];
		for(int i =0 ; i<= length/2 ; i++) {			
			reversedInputStringCharArray[i] = inputString.charAt(length - 1 -i);
			reversedInputStringCharArray[length - 1 -i] = inputString.charAt(i);
		}
		return String.valueOf(reversedInputStringCharArray);		
	}
	
	 public static void main(String[] args) {
		 
		 System.out.println(reverseStringMethod1("Steve is a good boy"));
	 }
}
