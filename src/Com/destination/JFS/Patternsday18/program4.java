package Com.destination.JFS.Patternsday18;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		int n=sc.nextInt();
		// 4  for loop
		System.out.println("==================== number repeated across all rows===========================");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("==================== number repeated across all columns===========================");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		System.out.println("====================1To25NumbersOrder===========================");
		// 5 while loop
		int m=1;
		for(int k=1;k<=n;k++) {
			for(int l=1;l<=n;l++) {
				System.out.print(m +" ");
				m+=1;
				
			}
			System.out.println();
		}
		System.out.println("==============1To25NumbersReverse====================");
		// 6 while loop
		int c=n*n;
		for(int o=1;o<=n;o++) {
			for(int g=1;g<=n;g++) {
				System.out.print(c +" ");
				c-=1;
				
			}
			System.out.println();
		}
        System.out.println("=============RightHalfDiamond====================");
     // 7 while loop
     		for(int a=1;a<=n;a++) {
     			for(int b=1;b<=n-a+1;b++) {
     				System.out.print("- ");	
     			}
     			for(int x=1;x<=a;x++) {
     			System.out.print(a+" ");
     			}
     			System.out.println();
     		}
             System.out.println("===============leftHalfDiamond===================");
             for(int a=1;a<=n;a++) {
      			for(int b=1;b<=a;b++) {
      				System.out.print(b+" ");	
      			}
      			System.out.println();
             }
             System.out.println("===================================");
	}
	

}
