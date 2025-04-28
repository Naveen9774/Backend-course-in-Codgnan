/*WAP to find the sum of the given string
 * input:ABCD
 * output:266
 */

package Com.destination.JFS.Stringsday41;

import java.util.Scanner;

public class StringSumcount {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the  string:");
				String str1 = sc.next();
				int count=0;				
				for(int i=0;i<str1.length();i++) {
					count=count +str1.charAt(i);
				}
				System.out.println(count);
			}

		}






