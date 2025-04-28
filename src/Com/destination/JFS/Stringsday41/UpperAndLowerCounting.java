package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

public class UpperAndLowerCounting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.next();
		int Capital_count=0;
		int Small_count=0;
		
		System.out.println("The length is "+str1.length());
		
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)>=65 && str1.charAt(i)<=90  ) {
				Capital_count++;
			}
			else if(str1.charAt(i)>=97 && str1.charAt(i)<=122) { 
				Small_count++;
			}
		}
		System.out.println("capital count = "+Capital_count);
		System.out.println("small count = "+Small_count);
		
	}
}
