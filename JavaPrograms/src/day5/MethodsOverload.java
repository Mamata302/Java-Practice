package day5;

public class MethodsOverload {

	public static void addition() {
	  System.out.println("This is the example of Methods Overloading");
	}
	
	public static void addition(int num) {
		int sum= num+num;
		System.out.println("The addition of the num with the same num is:" +sum);	
	}
	
	public static void addition(int num1, int num2) {
		int sum1= num1+num2;
		System.out.println("The addition of the two numbers are:" +sum1);
	}
	
	public static void addition(float num3, float num4) {
		double sum2= num3+num4;
		System.out.println("The addition of the two float numbers are:" +sum2);
	}
	
	public static void addition(float num5, int num6) {
		double sum3= num5+num6;
		System.out.println("The addition of the two numbers are:" +sum3);
	}
	
	public static void main(String[] args) {

		MethodsOverload.addition();
		MethodsOverload.addition(50,50);
		MethodsOverload.addition(10.2f,11.3f);
		MethodsOverload.addition(6.2f,22);
			
	}

}
