package Com.destination.JFS.Stringsday41;

public class StringsComparing {
	public static void main(String[] args) {
		String str1="Rama";
		String str2="RAMA";
		if(str1.compareTo(str2)==0) {
			System.out.println("Strings are equal by considering the cases");
		}
		else {
			System.out.println("Strings are not equal ");
		}
		System.out.println("-------------------------------");
		 if(str1.compareToIgnoreCase(str2)==0) {
			System.out.println("Strings are equal by irrespective of  the with cases");
		}
		 else {
				System.out.println("Strings are not equal ");
			}
	}

}


