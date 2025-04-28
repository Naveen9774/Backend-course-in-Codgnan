package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str1=sc.next();
		String str2="";
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
			
		}
		System.out.println("The Revesed String "+ " is : "+str2);
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("The String is a" + " Palindrome");
		}
		else {
			System.out.println("The String is not a" + " Palindrome");
		}
	}

}
