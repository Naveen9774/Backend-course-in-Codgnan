package Com.destination.JFS.Arraysday35;

import java.util.Scanner;

public class arraypg4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class count: ");
		int cls=sc.nextInt();
		
		String arr[][]=new String[cls][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of student in class number - "+(i+1));
			int stu=sc.nextInt();
			arr[i]=new String[stu];
			
		} 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class number : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student name : "+(j+1));
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class number : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student name : "+(j+1)+" is = "+arr[i][j]);
				
			}
		}
	}

}
