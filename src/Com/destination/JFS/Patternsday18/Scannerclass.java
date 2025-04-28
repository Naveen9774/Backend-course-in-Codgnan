package Com.destination.JFS.Patternsday18;

import java.util.Scanner;

public class Scannerclass {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Byte data : ");
		 byte byt=sc.nextByte();
		 System.out.println("Byte data is : "+byt);
		 System.out.println("=========================================");
		 System.out.println("Enter the short data : ");
		 short srt=sc.nextShort();
		 System.out.println("short data is : "+srt);
		 System.out.println("=========================================");
		 System.out.println("Enter the Int data : ");
		 int i=sc.nextInt();
		 System.out.println("Int data is : "+i);
		 System.out.println("=========================================");
		 System.out.println("Enter the Long data : ");
		 long l=sc.nextLong();
		 System.out.println("long data is : "+l);
		 System.out.println("=========================================");
		 System.out.println("Enter the Float data : ");
		 float f=sc.nextFloat();
		 System.out.println("Float data is : "+f);
		 System.out.println("=========================================");
		 System.out.println("Enter the Double data : ");
		 Double d=sc.nextDouble();
		 System.out.println("Double data is : "+d);
		 System.out.println("=========================================");
	}

}
