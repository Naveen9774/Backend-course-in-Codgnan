package Com.dtn.jfs.TpesOfExceptionHandling1day31;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first number : ");
			int num1=sc.nextInt();
			System.out.println("Enter the second number : ");
			int num2=sc.nextInt();
			int res=num1/num2;
			System.out.println(res);
			
		}
		catch(Exception e) {
			System.err.println("Created exception handled");
			
		}
	}

}
