package Com.destination.JFS.ConditionalSts.Loopsday16;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		if(n%2==0) 
		{
          System.out.println("Even number");
	     }
		else {
			System.out.println("odd number");
		}
	}
}
