package Com.dtn.jfs.WrapperClassday42;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class collectionSorting {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(15);
		al.add(19);
		al.add(24);
		al.add(10);
		System.out.println(al);
		
		//Approach-1
		//TreeSet<Integer> ad=new TreeSet<Integer>();
		//ts.addAll(al);
		//al.clear();
		//al.addAll(ts);
		
		Collections.sort(al);
		
		System.out.println(al);
		System.out.println("--------------------");
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(23);
		ad.add(15);
		ad.add(19);
		ad.add(24);
		ad.add(10);
		System.out.println(ad);
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.addAll(ad);
		Collections.sort(al1);
		ad.clear();
		ad.addAll(al1);
		System.out.println(ad);
		
	}

}
