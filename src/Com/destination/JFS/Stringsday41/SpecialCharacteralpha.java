package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

public class SpecialCharacteralpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		String str_new="";
		int count=0;				
		for(int i=0;i<str1.length();i++) {
			count=count +str1.charAt(i);
		}
		System.out.println(count);
	}
	
	

}
