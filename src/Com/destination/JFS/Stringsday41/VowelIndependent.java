/*WAP to replace all the in dependent vowels with specific 
 * special character as mentioned below
 * 
A or a---------------->@
E or e---------------->#
I or i---------------->$
O or o---------------->%
U or u---------------->&

input: AeIoU 
output:@#$%8

input: Hi Good MORNING
output : H$ G%%d M%RN$NG   */

package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

public class VowelIndependent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		String str_new="";
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a' ||  str1.charAt(i)=='A' ){
					str_new=str_new+'@';
			}
			else if(str1.charAt(i)=='e'|| str1.charAt(i)=='E' ) {
				str_new=str_new+'#';
			}
			else if(str1.charAt(i)=='i'|| str1.charAt(i)=='I' ) {
				str_new=str_new+'$';
			}
			else if(str1.charAt(i)=='o'|| str1.charAt(i)=='O' ) {
				str_new=str_new+'%';
			}
			else if(str1.charAt(i)=='u'|| str1.charAt(i)=='U' ) {
				str_new=str_new+'&';
			}
			else {
				str_new=str_new + str1.charAt(i);
			}
		}
		str1=str_new;
		System.out.println(str1);
	}
	

}
