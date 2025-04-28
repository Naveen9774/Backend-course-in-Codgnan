package Com.destination.JFS.Anagramday42;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String s1 = "debca";
		String s2 = "bcdea";
		String tem_str = "";
		
		if(s1.length() == s2.length()) {
			StringFunctions sf = new StringFunctions();
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
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
	

