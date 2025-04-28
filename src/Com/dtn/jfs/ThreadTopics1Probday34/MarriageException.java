package Com.dtn.jfs.ThreadTopics1Probday34;

import java.util.Scanner;

public class MarriageException {
	class overageException extends Exception{
		public String getMessage(){
			return"You Are already a Senior citizen.Dont have over desires";
		}
	}
	class underAgeException extends Exception{
		public String getMessage() {
			return"You are yet to grow up.First be an adult to apply and thnik about marriage";
		}
	}
	class Candidate{
		int age;
		void collectdata() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age : ");
			age=sc.nextInt();
		}
		void verify() throws underAgeException,overageException{
			if(age<18) {
				underAgeException uae=new underAgeException();
				System.out.println(uae.getMessage());
				throw uae;
			}
			else if(age>50) {
				overageException oae=new overageException();
				System.out.println(oae.getMessage());
				throw oae;
			}
			else {
				System.out.println("welcome to the matrimony account");
			}
		}
	}

class Matrimony{
	void permit(Candidate c) {
		try {
			c.collectdata();
			c.verify();
		}
		catch(overageException| underAgeException e1) {
			try {
				c.collectdata();
				c.verify();
			}catch(overageException | underAgeException e2) {
				try {
					c.collectdata();
					c.verify();
				}catch(overageException | underAgeException e3) {
					System.out.println("User is Blocked");
					System.exit(0);
				}
		}
	}
}
}
}
 class program6
 {
	public static void main(String[] args)
	{
		Candidate c1=new Candidate();
		Matrimony m=new Matrimony();
		m.permit(c1);
	}
 }



