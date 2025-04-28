package Com.dtn.jfs.TypesOfExceptionHandling2day32;

import java.util.Scanner;

public class duckingexceptionhandling2 {
	class Operation1{
	void function1() {
	System.out.println("Inside Function-1");
	Scanner sc=new Scanner(System.in);
	System.out.println("Division Operation started ");
	System.out.println("Enter the num1 :");
	int num1=sc.nextInt();//critical statement------inputmistmatchException
	System.out.println("Enter the num2 : ");
	int num2=sc.nextInt();//critical statement------inputmistmatchException
	int res=num1/num2;//critical statement--arithmeticException
	System.out.println(res);
	
	System.out.println("Division Operation completed");
	
	System.out.println("Array based operation is started");
	System.out.println("Enter the array size: ");
	int size=sc.nextInt();//critical statement------inputmistmatchException
	int arr[]=new int[size];//critical statement--negetiveArraysize Exception
	System.out.println("Enter the position into which value has to be stored:");
	int pos=sc.nextInt();//critical statement------inputmistmatchException
	System.out.println("Enter the value to be inserted :");
	int val=sc.nextInt();//critical statement--inputmistmatchException
	arr[pos]=val;//critical statement--Arrayindex of boundsexception
	System.out.println("Data added");
	System.out.println("Array Operation is completed");
	}
}
class Operation2{
	void function2() {
		System.out.println("Inside Function-2");
		Operation1 op1=new Operation1();
		op1.function1();
		System.out.println("Left Function-2");		
	}
}
class Operation3{
	void function3() {
	
	try {
		System.out.println("Inside Function-3");
		Operation2 op2=new Operation2();
		op2.function2();
	}
	catch (Exception e) {
		System.out.println("Exception Handled in Fun-3");
	}
   System.out.println("");
}
class Operation4{
	void function3() {
		System.out.println("Inside Function-4");
		Operation3 op3=new Operation3();
		op3.function3();
		System.out.println("Left Function-2");		
	}
  }

 }
}









