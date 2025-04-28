package Com.dtn.jfs.ThreadTopics1Probday34;

import java.util.Scanner;

	class Addition extends Thread{
		@Override
		public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition Operation Started ");
		System.out.println("Enter the first number for addition :");
		int add_num1=sc.nextInt();
		System.out.println("Enter the second number for addition :");
		int add_num2=sc.nextInt();
		int add_res=add_num1 + add_num2;
		System.out.println("The addition result is : "+add_res);
		System.out.println("Addition Operation Completed");
		}
		class Multiplication extends Thread{
			@Override
			public void run() {
				Scanner sc=new Scanner(System.in);
		        System.out.println("Multiplication Operation Started ");
		        System.out.println("Enter the first number for Multiplication :");
		        int mul_num1=sc.nextInt();
		        System.out.println("Enter the second number for Multiplication :");
		        int mul_num2=sc.nextInt();
		        int mul_res=mul_num1 * mul_num2;
		        System.out.println("The Multiplication result is : "+mul_res);
		       System.out.println("Multiplication Operation Completed");
		}
	}
	 class printing1 extends Thread{
		   @Override
		   public void run() {
			   try {
		       System.out.println("Printing Operation-1 is started");
		         for(int i=1;i<=5;i++) {
			         System.out.println("India is the best country");
			        Thread.sleep(3000);
		        }  
		       System.out.println("Printing Operation-1 is Completed");
			   }catch(Exception e) {
				   e.printStackTrace();
			   }
		   }
	   }
	   class printing2 extends Thread{
		   @Override
		   public void run() {
			   try {
		         System.out.println("Printing Operation-2 is started");
		          for(int i=1;i<=5;i++) {
			    System.out.println("Ganesh is the GOAT of My family ");
			     Thread.sleep(3000);
		     }
		    System.out.println("Printing Operation-2 is Completed");
	       }catch(Exception e) {
		     e.printStackTrace();
	   }
		   }
	   }
	   public class MultiThread1{
		   public static void main(String[] args) {
			Addition a=new Addition();
			Multipication m=new Multipication();
			printing1 p1=new printing1();
			printing2 p2=new printing2();
		}
	   }
		}


		
		
		

