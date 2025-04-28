package Com.destination.JFS.ConditionalSts.Loopsday16;

import java.util.Scanner;

public class esleifCondition {
	public static void main(String[] args) {
		System.out.println("Enter the age : ");
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		if(age<18) {
			System.out.println("minor");
		}
		else if(age>=18 && age<60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("senior citizen");
		}
	}

}
