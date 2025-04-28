package Com.destination.JFS.Patternsday18;

import java.util.Scanner;

public class PatternsAtoZ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0) || (i==0) || (i==n/2) ||(j==n-1)) {
					System.out.print("A ");
				}
				else {
					System.out.print("  ");
				}
			}
				
			System.out.print("  |  ");	
				for(int j=0;j<n;j++) {
					if(( i==0 && j<=(n/2)) || (i==(n/2) && j<=(n/2))
							||(j==n/2) ||(j==0)) 
					{
						System.out.print("A ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("  |  ");	
				
				for(int j=0;j<n;j++) {
					if(( i==0 && j!=0 && j!=n-1) || (j==n-1 && i!=0)
							||(i==n/2) ||(j==0 && i!=0)) 
					{
						System.out.print("A ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println(" ");
		}
		System.out.println("=B================================================================================");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( (i==0) || (j==0) || (i==n/2) ||(j==n-1) || (i==n-1)){
					System.out.print("B ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  |  ");	
			for(int j=0;j<n;j++) {
				if(( i==0 && j<=(n/2)) || (i==(n/2) && j<=(n/2))
						||(j==n/2) ||(j==0) || (i==n-1 && j<=(n/2))) 
				{
					System.out.print("B ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  |  ");	
			
			for(int j=0;j<n;j++) {
				if(( i==0  && j!=n-1) || (j==n-1 && i!=0)
						||(i==n/2) ||(j==0 && i!=0) || ( i==n-1  && j!=0 && j!=n-1)) 
				{
					System.out.print("B ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
	    }
		System.out.println("=C===========================================================================================");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( (i==0) || (j==0) || (i==n-1)){
					System.out.print("C ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  |  ");	
			for(int j=0;j<n;j++) {
				if(( i==0 && j<=(n/2))  ||(j==0) 
						|| (i==n-1 && j<=(n/2))) 
				{
					System.out.print("C ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  |  ");	
			
			for(int j=0;j<n;j++) {
				if(( i==0 && j!=0 && j!=n-1)
						 ||(j==0 && i!=0) || ( i==n-1  && j!=0)) 
				{
					System.out.print("C ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
	    }
		System.out.println("=D===========================================================================================");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( (i==0) || (j==0) || (i==n-1) || (j==n-1)){
					System.out.print("D ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  |  ");	
			for(int j=0;j<n;j++) {
				if(( i==0 && j<=(n/2))  ||(j==0) 
						|| (i==n-1 && j<=(n/2)) || (j==n/2)) 
				{
					System.out.print("D ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  |  ");	
			
			for(int j=0;j<n;j++) {
				if(( i==0  && j!=n-1) || (j==n-1 && i!=0)
					 ||(j==0 && i!=0) || ( i==n-1  && j!=0 && j!=n-1)) 
				{
					System.out.print("D ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
	    }
	}
	
}
