package Com.dtn.jfs.LeetCodeProbEasydate28dec;

import java.util.Scanner;

/*public class panlindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n values : ");
		int num=sc.nextInt();
		
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num+" is Palindrome.");
		}
		else {
			System.out.println(org_num+" is not a Palindrome.");
		}
	}

}
/*
Let’s break down how this works with an example, say num = 1234:

First iteration:

num = 1234, rev = 0
rev = rev * 10 + num % 10 → rev = 0 * 10 + 1234 % 10 = 0 + 4 = 4
num = num / 10 → num = 1234 / 10 = 123
Second iteration:

num = 123, rev = 4
rev = rev * 10 + num % 10 → rev = 4 * 10 + 123 % 10 = 40 + 3 = 43
num = num / 10 → num = 123 / 10 = 12
Third iteration:

num = 12, rev = 43
rev = rev * 10 + num % 10 → rev = 43 * 10 + 12 % 10 = 430 + 2 = 432
num = num / 10 → num = 12 / 10 = 1
Fourth iteration:

num = 1, rev = 432
rev = rev * 10 + num % 10 → rev = 432 * 10 + 1 % 10 = 4320 + 1 = 4321
num = num / 10 → num = 1 / 10 = 0
Since num is now 0, the loop stops, and rev contains the reversed number 4321.*/
	
	
	
	public class panlindrome {
	    public static void main(String[] args) {
	        int num = 12345; // Example number
	        int rev = 0; // Variable to store the reversed number

	        // Loop until num becomes 0
	        while (num != 0) {
	            int digit = num % 10;  // Get the last digit of num
	            rev = rev * 10 + digit;  // Add it to the reversed number
	            num = num / 10;  // Remove the last digit from num
	        }

	        // Output the reversed number
	        System.out.println("Reversed number: " + rev);
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	