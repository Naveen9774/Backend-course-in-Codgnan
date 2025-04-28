package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		int vowel_count=0;
		int cons_count=0;
		System.out.println("The length is "+str1.length());
		str1=str1.toLowerCase();
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || 
					str1.charAt(i)=='o' || str1.charAt(i)=='u'  ) {
				vowel_count++;
			}
			else {
				cons_count++;
			}
		}
		System.out.println("vowel count = "+vowel_count);
		System.out.println("cons count = "+cons_count);
		
		
	}

}
