package Assignment;

import java.util.Scanner;

public class Primenoprint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i=0;
		
		int num=0;
		
		String primeNum = "";
		
		System.out.println("Enter the value of n :");
		
		int n = sc.nextInt();

		sc.close();
		
		for (i=1; i<=n; i++)
		{
			int counter=0;
			
			for (num=i; num>=1; num--) 
			{
				if (i%num==0)
				{
					counter=counter+1;
				}
				
			}
			if (counter==2)
			{
				primeNum = primeNum + i + " ";
			}
			
		}
			System.out.println("Prime numbers from 1 to n are :");
			
			System.out.println(primeNum);
		}
		
		
	}

