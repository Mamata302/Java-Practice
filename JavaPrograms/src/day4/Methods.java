package day4;

import java.util.Scanner;

public class Methods {

	public static void sum() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1:");
		float num1=sc.nextFloat();

		System.out.println("Enter num2:");
		float num2=sc.nextFloat();
		
		sc.close();
		
		double sum= num1 + num2;
		System.out.println("Sum of two numbers=:" +sum);
	
	}

	public static void sub() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1:");
		float num1=sc.nextFloat();

		System.out.println("Enter num2:");
		float num2=sc.nextFloat();
		
		sc.close();
		
		double sub= num1 - num2;
		System.out.println("Sub of two numbers=:" +sub);
		
	}
	
public static void mul() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1:");
		float num1=sc.nextFloat();

		System.out.println("Enter num2:");
		float num2=sc.nextFloat();
		
		sc.close();
		
		double mul= num1 * num2;
		System.out.println("Mul of two numbers=:" +mul);
}

public static void div() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter num1:");
	float num1=sc.nextFloat();

	System.out.println("Enter num2:");
	float num2=sc.nextFloat();
	
	sc.close();
	
	double div= num1 / num2;
	System.out.println("Div of two numbers=:" +div);
	
}

public static void areaofrectangle() {

Scanner sc = new Scanner(System.in);
	
	// Area of Rectangle
	
     System.out.println("Enter Length:");
     float l= sc.nextFloat();
     System.out.println("Length:" +l);
     
     System.out.println("Enter Width:");
     float w= sc.nextFloat();
     System.out.println("Width:" +w);
     
     sc.close();
     
     double area = l * w;
     System.out.println("Area of Rectangle is:" +area);
}

public static void areaofcircle() {
	
Scanner sc = new Scanner(System.in);
	
	// Area of Circle
	
     System.out.println("Enter Radius:");
     float r= sc.nextFloat();
     System.out.println("Radius:" +r);
     
     sc.close();
     
     double area = 3.14 * r * r ;
     System.out.println("Area of Circle is:" +area);
		
}

public static void main(String[] args) {
	
	Methods.sum();
	Methods.sub();
	Methods.mul();
	Methods.div();
	Methods.areaofrectangle();
	Methods.areaofcircle();
	day5.MethodsOverload.addition(18.2f, 2.2f);
	
}
}
