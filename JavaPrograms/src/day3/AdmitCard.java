package day3;

import java.util.Scanner;

public class AdmitCard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		
		String Name =sc.next();
		
		System.out.println("Enter your Roll No=");
		
		int RollNo =sc.nextInt();
		
		sc.close();
		
		if(Name.equals("John") && RollNo==1) {
			System.out.println("Download your Admit Card");
		}
		
		else if(Name.equals("Mathew") && RollNo==2) {
			System.out.println("Download your Admit Card");	
		}
		
		else if(Name.equals("Rocky") && RollNo==3) {
		    System.out.println("Download your Admit Card");
		}
		
		else if(Name.equals("David") && RollNo==4) {
		     System.out.println("Download your Admit Card");
		}
		
		else {
		     System.err.println("Invalid input");
		}
		
	}
	
}
