package Com.dtn.jfs.TpesOfExceptionHandling1day31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trywithmultipleexception {
	public static void main(String[] args) {
		try {
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
		//specific catch blocks
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception generated due to / by 0 problem is handled");
			
		}
		catch(InputMismatchException e2){
			System.out.println("Invakied input is provied");
		}
		catch(NegativeArraySizeException e3) {
			System.out.println("Array Size cannot be negetive");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("The specified position is beyoned the size of the array");
		}
		//generic catch block
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
