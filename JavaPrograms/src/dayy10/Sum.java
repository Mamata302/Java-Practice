package dayy10;

import java.util.Scanner;

public class Sum {

	public Sum() {
		System.out.println(" * I am constructor from the Sum class.\n");
		
	}
	
	public Sum(int num1, int num2) {
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter num1:");
	    int number1= sc.nextInt();
	    
	    System.out.println("Enter num2:");
	    int number2= sc.nextInt();
		
	    int addition= number1+number2;
		System.out.println("The sum of two numbers are =" + addition);
		sc.close();
		
	}

	public Sum(String methodname) {
		System.out.println("\nThe name of the method is :"  +  methodname);
	}
	
	public void sub( ) {
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("\nEnter num1:");
	    int num1= sc.nextInt();

	    System.out.println("Enter num2:");
	    int num2= sc.nextInt();
	    sc.close();
	    
	    double sub = num1 - num2;
	    System.out.println("The sub of two numbers are ="   + sub);
		
	}
}
