package Com.dtn.jfs.CollectionBinarySearchday43;

import java.util.ArrayList;
import java.util.Collections;
public class BuildMethodsInsideCollectionClass {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(125);
		al.add(175);
		al.add(75);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		int pos = Collections.binarySearch(al,75);
		System.out.println(pos);
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(1100);
		all.add(150);
		all.add(1150);
		all.add(125);
		all.add(1125);
		all.add(1175);
		all.add(175);
		all.add(1125);
		all.add(1175);
		all.add(175);
		all.add(1125);
		all.add(1175);
		all.add(175);
		Collections.copy(all,al);
		System.out.println(all);
		
		Integer max = Collections.max(all);
		System.out.println(max);
		Integer min = Collections.max(all);
		System.out.println(min);
		
		int frequency = Collections.frequency(all, 1175);
		System.out.println(frequency);
		System.out.println(all);
		Collections.replaceAll(all,  1175,  2275);
		System.out.println(all);
		Collections.reverse(all);
		System.out.println(all);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		System.out.println(al2);
		Collections.rotate(al2, 3);
		System.out.println(al2);
		Collections.shuffle(al2);
		System.out.println(al2);
		Collections.swap(al2, 2, 4);
		System.out.println(al2);
	}		
}


