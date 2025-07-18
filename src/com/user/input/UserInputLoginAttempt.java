package com.user.input;

import java.util.Scanner;

public class UserInputLoginAttempt {
	public static void main (String [] args) {
		boolean loggedIn = false;
		int failedAttempts = 0;
		int maxAttempts = 3;
		
		Scanner sc = new Scanner(System.in);
		
		while (failedAttempts < maxAttempts && !loggedIn) {
			System.out.print("Enter Username: ");
			String userName = sc.nextLine();
			
			System.out.print("Enter your password: ");
			String password = sc.nextLine();
			
			if (userName.equals("samy123") && password.equals("12345")) {				
				System.out.println("Welcome back " + userName);
				loggedIn = true;
			}else {
				failedAttempts++;
				System.out.println("Login failed. Please try again, you have 3 attempts. This is your " + failedAttempts + " failed attempt.");
			}
			
			if(failedAttempts == maxAttempts ) {
				System.out.println("Maxium login attmepts have been reached, you are locked out!");
			}
		}
		sc.close();
	}

}
