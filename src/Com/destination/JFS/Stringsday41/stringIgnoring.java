package Com.destination.JFS.Stringsday41;

public class stringIgnoring {
	public static void main(String[] args) {
		String str1="Rama";
		String str2="RAMA";
		if(str1.equals(str2)==true) {
			System.out.println("Strings are equal by considering the cases");
		}
		else {
			System.out.println("Strings are not equal ");
		}
		System.out.println("------------------------------");
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("Strings are equal by irrespective of  the with cases");
		}
		else {
			System.out.println("Strings are not equal ");
		}
	}

}
