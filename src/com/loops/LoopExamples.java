package com.loops;

public class LoopExamples {
	/*
	 * i = 0 starts the count by setting the variable to 0
	 * i < 10 is the loop that will stop at the number 10. if i is less than 10, it will print all
	 * the iterations until it gets to 10
	 * i++ is the count
	 */

	public static void main(String [] args) {
		//This will print 0 - 9
//		for (int i = 0; i < 10; i++) {
//			System.out.println("This line will print 10 times including 0." + i);
//		}
		
		
		// This will print 1 - 9
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		//This will print all even numbers
//		for (int i = 0; i < 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		
		//This loop will check a condition in the beginning
//		int x = 0;
//		while (x < 10) {
//			System.out.println(x);
//			x++; //You have to stop a while loop or it will keep going, this stops this program at 10
//		}
		
		
		//This loop checks the condition at the end of the loop. will run at least once
//		int x = 10;
//		do {
//			System.out.println(x);
//			x++;
//		}while(x < 2);
//		
		for (int i = 10; i > 0; --i) {
    		System.out.println(i);
    		}
			
	}
}
