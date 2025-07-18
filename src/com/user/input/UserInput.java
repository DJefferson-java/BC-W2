package com.user.input;

import java.util.Scanner;

public class UserInput {


 public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter your name");
	 String name = sc.nextLine();
	 
	 System.out.println("Welcome, " + name);
	 
	 int selection = 0;	
	 double total = 0;
	 
	 while (selection != 5) {
		 System.out.println("Select an option ");
		 System.out.println("1) add candybar to shopping cart : 1.99");
		 System.out.println("2) add cheese to shopping cart : 3.99");
		 System.out.println("3) add milk to shopping cart : 2.99");
		 System.out.println("4) add eggs to shopping cart : 5.00");
		 System.out.println("5) Check Out");
		 
		  selection =  sc.nextInt();
		 		 
		 switch (selection) {
		 case 1: 
			 total += 1.99;
			 break;
		 case 2: 
			 total += 3.99;
			 break;
		 case 3:
			 total += 2.99;
			 break;
		 case 4:
			 total += 5.00;
			 break;
		 case 5:
			 break;
		default: 
				 System.out.println("Please pick a valid selection");		 
		 }
		 
	 }
	 
	 
	 System.out.println("Your current total is " + total);
 }




}
