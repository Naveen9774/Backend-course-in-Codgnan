package Com.destination.JFS.LinkedListday38;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		System.out.println(li);
		li.addFirst(1000);
		System.out.println(li);
		li.addLast(3000);
		System.out.println(li);
		li.add(4,800);
		System.out.println(li);
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		System.out.println(al);
		
		
		al.addAll(al);
		System.out.println(al);
		
		
		al.addAll(4,al);
		System.out.println(al);
		
		
	}

}
