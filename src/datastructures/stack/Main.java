package datastructures.stack;


public class Main {

	public static void main(String[] args) {
		
		Employee emp1 =  new Employee("steve1994", "Steve Mathews");
		Employee emp2 =  new Employee("dion1996", "Dion Mathews");
		Employee emp3 =  new Employee("della1962", "Della Mathews");
		Employee emp4 =  new Employee("mathews1962", "C A Mathews");
		Employee emp5 =  new Employee("hari1995", "Hari Govind");		
		
		/*
		 * Stack is just a kind of restriction of the operation performed.
		 * Stack can be backed by arrays or linkedList.
		 * arrays backed stack : less space constraint but time complexity increase for 
		 * push/pop if the backing array is full due to resizing of backing array
		 * linkedList backed stack : more space required but no resizing of backing data structure
		 * Stack allows only FIFO operations , ie operation only on top of stack
		 * pop() : push the item to top of stack. O(1):  linkedList backed stack , can be O(n) : arrays backed stack
		 * push() : remove and return the item from the top of stack .  O(1):  linkedList backed stack , can be O(n) : arrays backed stack
		 * peek() : just return the item from the top of stack . O(1) for both type
		 * 
		 * */
		
		
		System.out.println("*********Array Stack ***********");
		
		ArrayStack arrayStack = new ArrayStack(10);
		arrayStack.push(emp1);
		arrayStack.push(emp2);
		arrayStack.push(emp3);
		arrayStack.push(emp4);
		arrayStack.print();
		System.out.println("Peeking : " + arrayStack.peek());
		arrayStack.pop();
		System.out.println("Peeking after poping : " + arrayStack.peek());
		
		
		System.out.println("*********LinkedList Stack ***********");
		LinkedListStack linkedListStack = new LinkedListStack();
		linkedListStack.push(emp1);
		linkedListStack.push(emp2);
		linkedListStack.push(emp3);
		linkedListStack.push(emp4);
		linkedListStack.print();
		System.out.println("Peeking : " + linkedListStack.peek());
		
		
	}

}
