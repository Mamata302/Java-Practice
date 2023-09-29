package dayy12;

import java.util.Scanner;

public class Exceptn1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		
		int num1= sc.nextInt();		
		
		System.out.println(num1);
		
		System.out.println("Enter second number: ");
		
		int num2= sc.nextInt();		
		
		System.out.println(num2);
		
		try {
		
		float div = num1/ num2;
		
		System.out.println("Division of two numbers is : " +div);

		} catch (Exception e) {
			
			//System.out.println("invalid number");
			
			e.printStackTrace();
			
		}
			
			finally { 
				
				sc.close();
			}
		}
}
