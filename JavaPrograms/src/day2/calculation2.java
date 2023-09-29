package day2;

import java.util.Scanner;

public class calculation2 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	// Area of Cylinder
	
     System.out.println("Enter Radius:");
     float r= sc.nextFloat();
     System.out.println("Radius:" + r);
     
     System.out.println("Enter Height:");
     float h= sc.nextFloat();
     System.out.println("Height:" + h);
     
     double area = 2* 3.14 * r * h + 2* 3.14 * r * r;
     System.out.println("Area of Cylinder:" + area);
     sc.close();
}


}
