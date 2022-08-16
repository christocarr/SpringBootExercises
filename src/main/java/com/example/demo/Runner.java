package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);

		Scanner sc = new Scanner(System.in);

		///1.
		//		boolean isEnd = false;
		//		
		//		while(!isEnd) {
		//			
		//			System.out.println("Enter first number");
		//			int num1 = Integer.parseInt(sc.next());
		//			
		//			System.out.println("Enter second number");
		//			int num2 = Integer.parseInt(sc.next());
		//			
		//			System.out.println("Enter a operation (+, -, *, or /)");
		//			String operation = sc.next();
		//			
		//			if(operation.equals("+")) {
		//				Calculation calc = new Calculation();
		//				
		//				System.out.println(calc.add(num1, num2));
		//				
		//			} else if(operation.equals("-")) {
		//				Calculation calc = new Calculation();
		//				
		//				System.out.println(calc.subtract(num1, num2));
		//				
		//			} else if(operation.equals("*")) {
		//				Calculation calc = new Calculation();
		//				
		//				System.out.println(calc.multiply(num1, num2));
		//				
		//			} else if(operation.equals("/")) {
		//				Calculation calc = new Calculation();
		//				
		//				System.out.println(calc.divide(num1, num2));
		//			}
		//
		//			
		//			System.out.println("Quit program? y or n");
		//			String quit = sc.next();
		//			
		//			if(quit.equals("y")) {
		//				isEnd = true;
		//			}
		//		}
		
		

		///2.
		boolean userTrue = false;
		boolean passwordTrue = false;
		
		while(!userTrue && !passwordTrue) {

			System.out.println("Enter your user name?");
			String userName = sc.nextLine().trim();

			System.out.println("Enter your password?");
			String password = sc.nextLine().trim();

			Profile profile = new Profile(userName, password);
			ProfileChecker pc = new ProfileChecker();

			boolean userExists = pc.getUserExist(profile);
			boolean userPasswordCorrect = pc.getUserPassword(profile);

			if (userExists && userPasswordCorrect) {
				
				System.out.println("Logging in...");
				userTrue = true;
				passwordTrue = true;
				
			} else {
				
				System.out.println("User does not exist please register");
				System.out.println("------------------------------------");
			}

		}
		
		sc.close();
	}

}
