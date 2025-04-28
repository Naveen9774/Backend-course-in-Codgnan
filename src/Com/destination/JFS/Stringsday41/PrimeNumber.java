package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

/*public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		int num=sc.nextInt();
		
		boolean isprime=true;
		
		if(num < 2) {
			isprime=false;
		}
		else {
			for(int i=2; i<=num/2;i++) {
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println(num + " is a prime Number. ");
		}
		else {
			System.out.println(num + " is Not prime Number. ");
		}
	}

}*/

  public class PrimeNumber{
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int count=0;
		  int number=2;
		  System.out.println("The first 10 prime numbers are : ");
		  
		  while(count < 10) {
			  if(isprime(number)) {
				  System.out.print(number+" ");
				  count++;
			  }
			  number++;
		  }
	}
	  public static boolean isprime(int num) {
		  if(num <2 ) {
			  return false;
		  }
		  for(int i=2;i<=Math.sqrt(num);i++) {
			  if(num%i==0) {
				  return false;
			  }
		  }
		  return true;
	  }
  }
 
