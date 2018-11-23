//Created by: Nicholas
//Created on: Nov 2018	
//This program calculates the Factorial of any given number

import java.util.Scanner;
public class Factorials {
	
	public static void main(String args[]) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number you would like to get the factorial of: ");
		int userNum = userInput.nextInt();
		
		int output = Factorial(userNum);
		
		System.out.println("The factorial of " + userNum + " is " + output);
	}
	
	

	public static int Factorial(int number) {
		
		if (number == 1) {
			return 1;
		}
		
		int result = Factorial(number - 1) * number;
		
		return result;
	}
}
