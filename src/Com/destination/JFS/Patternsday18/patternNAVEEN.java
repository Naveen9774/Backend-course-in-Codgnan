package Com.destination.JFS.Patternsday18;

import java.util.Scanner;

public class patternNAVEEN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==n-1) ||(j==0)||i==j) 
				{
					System.out.print("N ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(( i==0 ) || (i==(n/2))
						||(j==n-1) ||(j==0)) 
				{
					System.out.print("A ");
				}
				else { 
					System.out.print("  ");
				}
			}
			System.out.print(" ");
	            for (int j = 0; j < 2 * n - 1; j++) {
	                if (j == i || j == (2 * n - 2 - i)) {
	                    System.out.print("V ");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.print("  ");
	            for(int j=0;j<n;j++) {
					if((i==0) ||(j==0)||i==n/2 ||i==n-1) 
					{
						System.out.print("E ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for(int j=0;j<n;j++) {
					if((i==0) ||(j==0)||i==n-1 ||i==n/2) 
					{
						System.out.print("E ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for(int j=0;j<n;j++) {
					if((j==n-1) ||(j==0)||i==j) 
					{
						System.out.print("N ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println("  ");		 
		}
	}
}
