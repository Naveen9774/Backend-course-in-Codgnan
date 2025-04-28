package Com.destination.JFS.Anagramday42;

import java.util.Scanner;

import java.util.Scanner;

/*
*Sample input : s1 = top, s2=opt
*Sample output : Anagram

*sample input : s1 = Look, s2=Luck
*sample output : Not Anagram
*/
class StringFunctions{
	char[] sortingArray(char[] c1) {
		int temp;
		for(int i=0;i<c1.length;i++) {
			for(int j=i+1;j<c1.length;j++) {
				if(c1[i] > c1[j]) {
					temp = c1[i];
					c1[i] = c1[j];
					c1[j] = (char) temp;
				}
			}
		}
	return c1;
	}
}

public class Anagram {
	public static void main(String[] args) {
		String s1 = "top";
		String s2 = "opt";
		String tem_str = "";
		
		if(s1.length() == s2.length()) {
			StringFunctions sf = new StringFunctions();
			char[] c1 = sf.sortingArray(s1.toCharArray());
			char[] c2 = sf.sortingArray(s2.toCharArray());
			s1 = "";
			s2 = "";
			for(int i=0;i<c1.length;i++) {
				s1 = s1 + c1[i];
				s2 = s2 + c2[i];
			}
			System.out.println("Sorted String");
			System.out.println("s1 = "+s1);
			System.out.println("s2 = "+s2);
			
			System.out.println("-----------");
			System.out.println("Checking if string are Anagram or not....");
			if(s1.equals(s2) == true) {
				System.out.println("Anagram");
				
			}
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}