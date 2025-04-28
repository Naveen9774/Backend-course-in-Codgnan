package Com.dtn.jfs.ThreadTopics2Probday35;

import java.util.Scanner;

public class MultiThreadUsingThreadClass {
	class Operation1 extends Thread{
		@Override
		public void run() {
			if(Thread.currentThread().getName().equals("add")) {
				add();
			}
			else if(Thread.currentThread().getName().equals("mul")) {
				Multiplication();
			}
			else if(Thread.currentThread().getName().equals("print1")) {
				print1();
			}
			else {
				print2();
			}
		}
	    void add() {
	    	try {
	             
		         Scanner sc=new Scanner(System.in);
		         System.out.println("Addition Operation Started ");
		         System.out.println("Enter the first number for addition :");
	             int add_num1=sc.nextInt();
		         System.out.println("Enter the second number for addition :");
		         int add_num2=sc.nextInt();
		         int add_res=add_num1 + add_num2;
		         System.out.println("The addition result is : "+add_res);
		         System.out.println("Addition Operation Completed");
	             }catch(Exception e){
	            	 e.printStackTrace();
	             }
	    	}
	}
	    	void Multiplication() {
	    		try {
	    			Scanner sc=new Scanner(System.in);
		            System.out.println("Multiplication Operation Started ");
		            System.out.println("Enter the first number for Multiplication :");
		            int mul_num1=sc.nextInt();
		            System.out.println("Enter the second number for Multiplication :");
		            int mul_num2=sc.nextInt();
		            int mul_res=mul_num1 * mul_num2;
		            Thread.sleep(3000);
		            System.out.println("The Multiplication result is : "+mul_res);
		            System.out.println("Multiplication Operation Completed");
	    		}catch (Exception e) {
	    			e.printStackTrace();
	    		
	    		}
	    	}
	    	
	    	void print1() {
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

	    
	    	void print2() {
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
	     class ThreadCode3{
		    public static void main(String[] args) {
			Operation1 o1=new Operation1 ();
			o1.setName("add");
			Operation1 o2=new Operation1 ();
			o1.setName("mul");
			Operation1 o3=new Operation1 ();
			o1.setName("print1");
			Operation1 o4=new Operation1 ();
			o1.setName("print2");
			
			o1.start();
			o2.start();
			o3.start();
			o4.start();
			
		}
	     
   

	public void print1() {
		// TODO Auto-generated method stub
		
	}

	public void print2() {
		// TODO Auto-generated method stub
		
	}
}
