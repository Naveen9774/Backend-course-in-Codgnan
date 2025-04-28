package Com.destination.JFS.Patternsday18;

import java.util.Scanner;

public class patterns {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number of the value : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				if(i==0  || j==(n-1) || j==0 || i==(n-1) || i==(n/2)
					||j==(n/2) || i==j){
				System.out.print("# ");
			}
				else {
					System.out.print(" ");
					
				}
		}
			System.out.println();	
	}
	}
}
