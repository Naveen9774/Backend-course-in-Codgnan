package Com.dtn.jfs.WrapperClassday42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		
		System.out.println("====================");
		System.out.println("Using ForLoop :");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=======================");
		System.out.println("Using for each loop :");
		for(Integer o: al) {
			System.out.println(o);
		}
		System.out.println("=======================");
		ArrayList<String> als=new ArrayList<String>();
		als.add("sachin");
		als.add("rohit");
		als.add("dhoni");
		als.add("virat");
		als.add("raina");
		System.out.println(als);
		System.out.println("================================");
		System.out.println("Using for each loop for String data :");
		for(String o:als) {
			System.out.println(o);
		}
		System.out.println("======================");
		System.out.println("Using Iterators :");
		Iterator<Integer> iterator=al.iterator();
		while(iterator.hasNext()==true) {
			System.out.println(iterator.next());
		}
		System.out.println("============================");
		System.out.println("Using list of Iterators :");
		ListIterator<Integer>listIterator=al.listIterator();
		while(listIterator.hasNext()==true) {
			System.out.println(listIterator.next());
		}
	}

}
