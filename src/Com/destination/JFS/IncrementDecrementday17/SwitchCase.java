package Com.destination.JFS.IncrementDecrementday17;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the first number : ");
		int n1=sc.nextInt();
		System.out.println("Please Enter the first number : ");
		int n2=sc.nextInt();
		System.out.println("Please enter the Option :\n"
				+ "1.Addtion\n"
				+ "2.Subtraction\n"
				+ "3. Multiplication\n"
				+ "4.Division\n");
		int Choice =sc.nextInt();
		int result;
		switch (Choice) {
		case 1:{
			System.out.println("Addition Operation");
			result = n1+n2;
			System.out.println(result);
			break;
		}
		case 2:{
			System.out.println("Subtraction Operation");
			result = n1-n2;
			System.out.println(result);
			break;
		}
		case 3:{
			System.out.println("Multiplication Operation");
			result = n1*n2;
			System.out.println(result);
			break;
		}
		case 4:{
			System.out.println("Division Operation");
			result = n1%n2;
			System.out.println(result);
			break;
		}
		
	}

 }
}
