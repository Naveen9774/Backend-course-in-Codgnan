package Com.destination.JFS.Patternsday18;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		int n=sc.nextInt();
		//for loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("==========FullDiamond===================");
		//for loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
