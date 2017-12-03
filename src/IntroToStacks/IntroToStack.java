package IntroToStacks;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		
		Stack<Double> numbers = new Stack<Double>(); 
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		
		Random randGen = new Random(); 
		
		for (int i = 0; i < 100; i++) {
			numbers.push(randGen.nextDouble()*100);
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Enter two numbers between 0 and 100");
		
		System.out.print("Num 1: ");
		int num1 = keyboard.nextInt(); 
		System.out.print("Num 2: ");
		int num2 = keyboard.nextInt(); 
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		Double n; 
		
		System.out.println("Elements between " + num1 + " and " + num2 + ": ");
		
		for(int i = 0; i < numbers.size(); i++) {
			n = numbers.pop(); 
			if (n < num2 && n > num1) {
				System.out.printf("%.2f%n", n);
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
