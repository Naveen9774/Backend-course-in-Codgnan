package Com.destination.JFS.Patternsday18;

import java.net.MulticastSocket;
import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		int n=sc.nextInt();
		// for
		for(int i=1;i<=5;i++) {
			System.out.print("# ");
			
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++");
		// while
		int j=1;
		while(j<=5) {
			System.out.print("# ");
			j++;
			
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++");
		// do while
		int k=1;
		do {
			System.out.print("# ");
			
			k++;
		}while(k<=5);
		
	}


	}

