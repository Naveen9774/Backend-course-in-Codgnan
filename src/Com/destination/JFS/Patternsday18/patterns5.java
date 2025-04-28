package Com.destination.JFS.Patternsday18;

import java.util.Scanner;

public class patterns5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)% 2==0){
					System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}


