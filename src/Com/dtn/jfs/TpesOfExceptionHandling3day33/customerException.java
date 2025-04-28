package Com.dtn.jfs.TpesOfExceptionHandling3day33;

import java.util.Scanner;

public class customerException {
	class InvalidAccountNoExeption extends Exception{
		public String getMessage() {
			return "The Provided Account Number Is Invalid.Please Try Again!!!";
		}
	}
class InvalidPasswordExeption extends Exception{
	public String getMessage() {
		return"The Provided Password Is Invalid.Please Try Again!!!";
	}
	
}
class Customer{
	private int accno;
	private int pwd;
	private int org_accno=111;
	private int org_pwd=222;
	
	void collectionData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account number :");
		accno=sc.nextInt();
		System.out.println("Enter the password :");
		}
	void validate() throws InvalidAccountNoExeption,InvalidPasswordExeption {
		if(accno==org_accno) {
			if(pwd==org_pwd) {
				System.out.println("Valid User");
		}
		else {
			InvalidPasswordExeption ipe=new InvalidPasswordExeption();
			System.out.println(ipe.getMessage());
			throw ipe;
			}
		}
		else {
			InvalidAccountNoExeption iae=new InvalidAccountNoExeption();
			System.out.println(iae.getMessage());
			throw iae;
			
		}
	}
}
class NetBanking{
	void verify(Customer c) {
		try {
			c.collectionData();
			c.validate();	
		}
		catch (InvalidAccountNoExeption | InvalidPasswordExeption e1) {
			try {
				c.collectionData();
				c.validate();
			}
			catch (InvalidAccountNoExeption | InvalidPasswordExeption e2) {
				try {
					c.collectionData();
					c.validate();
				}
				catch (InvalidAccountNoExeption | InvalidPasswordExeption e3) {
					System.out.println("User is Blocked");
					System.exit(0);
					}
				
				}
			
			}
		}
	}

}
 class program5{
	 public static void main(String[] args) {
		Customer c1=new Customer();
		NetBanking nb=new NetBanking();
		nb.verify(c1);
	}
 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

