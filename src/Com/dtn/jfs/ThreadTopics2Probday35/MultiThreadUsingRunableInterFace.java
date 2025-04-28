package Com.dtn.jfs.ThreadTopics2Probday35;
import java.util.Scanner;

class operation implements Runnable {

	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}else if(Thread.currentThread().getName().equals("multiplication")) {
			multiplication();
		
		}else {
			print1();
		}
	}
	void add() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition operaation is started");
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("the resukt is"+res);
		System.out.println("addition operqtion is completed");		
       }catch(Exception e) {
	     e.printStackTrace();
     }
	}
void multiplication() {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("mul operaation is started");
		System.out.println("Enter the first number");
		int num3=sc.nextInt();
		System.out.println("enter the second number");
		int num4=sc.nextInt();
		int res1=num3*num4;
		System.out.println("the resukt is"+res1);
		System.out.println("mul operation is completed");		
       }catch(Exception e) {
	     e.printStackTrace();
     }

}
void print1(){
	
		try {
			System.out.println("printing opeation is started");
			for(int i=1;i<=5;i++) {
				System.out.println("Dhoni is Goat");
				Thread.sleep(3000);
			}
			System.out.println("print operationis completed");
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

public class thread4{
	public static void main(String[] args) {
		operation o1=new operation();
		Thread t1=new Thread(o1);
		t1.setName("add");	
		operation o2=new operation();
		Thread t2=new Thread(o2);
		t2.setName("multiplication");
		operation o3=new operation();
		Thread t3=new Thread(o3);
		t3.setName("print1");
		operation o4=new operation();
		Thread t4=new Thread(o3);
		t4.setName("print2");
		
		
		t1.start();
		t2.start();
		t3.start();
		o1.print1();
		o4.print2();
		
		}

}


}