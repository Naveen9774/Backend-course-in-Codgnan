package Com.dtn.jfs.TpesOfExceptionHandling3day33;
import java.util.Scanner;
public class ReThrowingofException3 {
	class Operation1 {
		void function1() throws Exception{
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
		}
	}
	class Operation2 {
		void function2()throws Exception {
			Operation1 op1=new Operation1();
			op1.function1();
		}
	}
	class Operation3{
		void function3() throws Exception{		
		try {
			Operation2 op2=new Operation2();
			op2.function2();
		}
		catch (Exception e) {
			System.out.println("Exception Handled in Fun-3");
			throw e;//re-throwing of exception
		}
	}			
}
}
 class program4{
	public static void main(String[] args) {
		try {
			Operation3 op3=new Operation3();
			op3.function3();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
 
}
