package day2;

import java.util.Scanner;

public class calculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Area of Trapezium
		
	     System.out.println("Enter Base1:");
	     float num= sc.nextFloat();
	     System.out.println("Base1:" + num);
	     
	     System.out.println("Enter Base2:");
	     float num1= sc.nextFloat();
	     System.out.println("Base2:" + num1);
	     
	     System.out.println("Enter Height:");
	     float num2= sc.nextFloat();
	     System.out.println("Height:" + num2);
	     
	     double area = ((num + num1) / 2) * num2;
	     System.out.println("Area of trapezium:" + area);
	     
	     sc.close();

		
	}

}
