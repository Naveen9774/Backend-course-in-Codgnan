package Com.destination.JFS.Stringsday41;
import java.util.Scanner;
public class vowelsReplaceing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = sc.nextLine();
		String str_new="";
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a' ||  str1.charAt(i)=='A' ||
				str1.charAt(i)=='e' || str1.charAt(i)=='E' ||
				str1.charAt(i)=='i' || str1.charAt(i)=='I'||
				str1.charAt(i)=='o' ||str1.charAt(i)=='O' ||
				str1.charAt(i)=='u' ||str1.charAt(i)=='U' ) {
				str_new=str_new+'@';
			}
			else {
				str_new=str_new + str1.charAt(i);
			}
		}
		str1=str_new;
		System.out.println(str1);
	}
	

}



