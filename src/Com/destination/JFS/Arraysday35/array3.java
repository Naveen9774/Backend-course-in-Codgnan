package Com.destination.JFS.Arraysday35;

import java.util.Scanner;

public class array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the college count: ");
		int clg=sc.nextInt();
		System.out.println("Enter the class count in each college: ");
		int cls=sc.nextInt();
		System.out.println("Enter the student count in each class: ");
		int stu=sc.nextInt();
		
		//creating an array to store student names
		String arr[][][]=new String[clg] [cls] [stu];
		//loop for collecting data
		for(int i=0;i<clg;i++) //count of classes
		{
			System.out.println("Inside the college : "+(i+1));
			for(int j=0;j<cls;j++) 
			{
				System.out.println("Inside the  class : "+(j+1));
				for(int k=0;k<stu;k++)
				{
				System.out.println("Enter the name of student number : "+(k+1));
				arr[i][j][k]=sc.next();
				}
			}
		}
		//loop for displaying data
		for(int i=0;i<clg;i++) 
		{
			System.out.println("Inside the college : "+(i+1));
			for(int j=0;j<cls;j++) 
			{
				System.out.println("Inside the  of class: "+(j+1));
				for(int k=0;k<stu;k++)
				{
				System.out.println("Enter the name of student number : "+(k+1)+" is = "+arr[i][j][k]);
				
				}
				
			}
		}
		
	}


}
