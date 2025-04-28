package Com.destination.JFS.ArrayListday40;
import java.util.ArrayDeque;
public class ArrayDequeBuiltinMethods {
	 public static void main(String[] args) {
			ArrayDeque ad=new ArrayDeque();
			//adding data 
			ad.add(55);
			ad.add(57);
			ad.add(32);
			ad.add(87);
			ad.add(78);
			ad.add(23);
			ad.add(1050);
			System.out.println(ad);
			ad.addLast(100);
			System.out.println(ad);
			ad.addFirst(10);
			System.out.println(ad);
			
			ArrayDeque ad2=new ArrayDeque();
			ad2.add(11);
			ad2.add(12);
			ad2.add(13);
			System.err.println(ad2);
			
			ad.addAll(ad2);
			System.out.println(ad);
			
			Object obj1=ad.getFirst();
			System.out.println(obj1);
			
			Object obj2=ad.getLast();
			System.out.println(obj2);
			
			int hc=ad.hashCode();
			System.out.println(hc);
			
			boolean empdata=ad.isEmpty();
			System.out.println(empdata);
			
			
			
			
		}

	}


