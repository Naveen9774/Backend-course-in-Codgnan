package Com.destination.JFS.Arraysday35;

import java.util.Scanner;

public class array2d5pg {
	public class arraypg4 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the school count: ");
			int scl=sc.nextInt();
			
			String arr[][][]=new String[scl][][];
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the count of class in school number - "+(i+1));
				int cls=sc.nextInt();
				arr[i]=new String[cls][];
				
			} 
			for(int i=0;i<arr.length;i++) {
				System.out.println("Inside the school number : "+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the name of class name : "+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("Enter the name of student name : "+(k+1));
					arr[i][j][k]=sc.next();
					}
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println("Inside the school number : "+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the name of class name : "+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("Enter the name of student name : "+(k+1)+" is = "+arr[i][j][k]);
					
				}
			}
		}

		}
	}
}



