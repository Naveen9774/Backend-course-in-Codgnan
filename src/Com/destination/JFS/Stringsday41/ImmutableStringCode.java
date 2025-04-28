package Com.destination.JFS.Stringsday41;

public class ImmutableStringCode {
	public static void main(String[] args) {
	StringBuffer sb1=new StringBuffer("Rama");
	StringBuffer sb2=new StringBuffer("Sita");
	System.out.println(sb1);
	System.out.println(sb2);
	System.out.println("==============================");
	StringBuffer sbb1=new StringBuffer("Rama");
	StringBuffer sbb2=new StringBuffer("Sita");
	System.out.println(sbb1);
	System.out.println(sbb2);
	System.out.println("==============================");
	
	
	String s1=new String("Rama");
	String s2=new String("Sita");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println("===========================");
	System.out.println("Mering of String in Immutable String :");
	s1.concat(s2);
	System.out.println(s1);
	System.out.println("Mering of String in mutable String -StringBuffer :");
	sb1.append(s2);
	System.out.println(sb1);
	
	System.out.println("Mering of String in Immutable String -StringBuilder :");
	sbb1.append(sbb2);
	System.out.println(sbb1);

	System.out.println("String Built-in Function");
	System.out.println(sb1.getClass());
	System.out.println("=====================");
	System.out.println(sb1.hashCode());
	System.out.println("=====================");
	System.out.println(sb1.length());
	System.out.println("=====================");
	System.out.println(sb1.charAt(5));
	System.out.println("=====================");
	System.out.println(sb1.indexOf("S"));
	System.out.println("=====================");
	System.out.println(sb1.deleteCharAt(5));
	System.out.println("=====================");
	System.out.println(sb1.capacity());
	System.out.println("=====================");
	System.out.println(sb1.isEmpty());
	System.out.println("=====================");
	System.out.println(sb1.compareTo(sb1));
	System.out.println("=====================");
	
	}

}
