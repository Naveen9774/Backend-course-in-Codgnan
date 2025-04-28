package Com.destination.JFS.Stringsday41;

public class StringsinUpperLower {
	public static void main(String[] args) {
		String str= "NaveenVinodGanesh";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(8));
//      System.out.println(str.charAt(800));
		System.out.println(str.concat(" - Family"));
 // 	str=str.concat(" - Friends");
		System.out.println(str);
		System.out.println(str.contains("Ro"));
		System.out.println(str.endsWith("Ganesh"));
		System.out.println(str.endsWith("kay"));
		System.out.println(str.startsWith("Naveen"));
		System.out.println(str.startsWith("Vinod"));
		System.out.println(str.indexOf("V"));
		System.out.println(str.hashCode());
		str=" ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
	}

	}



