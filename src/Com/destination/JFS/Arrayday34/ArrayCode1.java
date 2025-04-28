package Com.destination.JFS.Arrayday34;

import java.util.Scanner;

public class ArrayCode1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of students: ");
		int n=sc.nextInt();
		//creating an array of 1D as we have to store only student marks
		int arr[]=new int[n];
		//loop for storing the data
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student numbetr : "+(i+1));
			arr[i]=sc.nextInt();
		}
		//loop for displaying the data
		for(int i=0;i<n;i++) {
			System.out.println("The marks of student number : "+(i+1)+" is = "+arr[i]);
		}
	}

}
