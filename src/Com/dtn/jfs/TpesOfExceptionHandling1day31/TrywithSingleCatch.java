package Com.dtn.jfs.TpesOfExceptionHandling1day31;

import java.util.Scanner;
public class TrywithSingleCatch{
class trycatch {
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
		catch(Exception e) {
			System.out.println("you cannot divide any number by 0");
			
		}
	}
}
}
