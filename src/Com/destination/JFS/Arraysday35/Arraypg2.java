package Com.destination.JFS.Arraysday35;

import java.util.Scanner;

public class Arraypg2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class count: ");
		int cls=sc.nextInt();
		System.out.println("Enter the student count in each class: ");
		int stu=sc.nextInt();
		
		//creating an array to store student names
		String arr[][]=new String [cls] [stu];
		//loop for collecting data
		for(int i=0;i<cls;i++) //count of classes
		{
			System.out.println("Inside classroom number : "+(i+1));
			for(int j=0;j<stu;j++) 
			{
				System.out.println("Enter the name of student number: "+(j+1));
				arr[i][j]=sc.next();
			}
		}
		//loop for displaying data
		for(int i=0;i<cls;i++) 
		{
			System.out.println("Inside classroom number : "+(i+1));
			for(int j=0;j<stu;j++) 
			{
				System.out.println("Enter the name of student number: "+(j+1)+" is = "+arr[i][j]);
				
			}
		}
		
	}

}
