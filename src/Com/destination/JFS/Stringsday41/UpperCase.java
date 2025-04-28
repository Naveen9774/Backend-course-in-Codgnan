package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper case" + " string:");
		String str1 = sc.next();
		String str2 = "";
		
		int j = str1.charAt(5);
		System.out.println(j);
		char c = str1.charAt(5);
		System.out.println(c);
		System.out.println("-----------");
		
		for(int i=0;i<str1.length();i++) {
			char c1 =(char) (str1.charAt(i)+32);
			str2 = str2 + c1;
		}
		System.out.println("The lower case" + " String is = "+str2);
	}

}