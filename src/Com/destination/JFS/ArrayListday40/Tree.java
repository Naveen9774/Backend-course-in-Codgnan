package Com.destination.JFS.ArrayListday40;
import java.util.LinkedList;
import java.util.TreeSet;

	public class Tree {
		 public static void main(String[] args) {
			TreeSet ts=new TreeSet();
			ts.add(10);
			ts.add(20);
			ts.add(30);
			ts.add(40);
			System.out.println(ts);
			
			boolean emp=ts.isEmpty();
			System.out.println(emp);
			
			int hashCode =ts.hashCode();
			System.out.println(hashCode);
			
			Object obj=ts.getFirst();
			System.out.println(obj);
			System.out.println(ts);
			
			
			Object obj1=ts.getLast();
			System.out.println();
			System.out.println(ts);
			
			
		    obj=ts.first();
		    System.out.println();
		    System.out.println(ts);
			
		    
		    obj=ts.last();
		    System.out.println();
		    System.out.println(ts);
			
		    
		    obj=ts.removeFirst();
		    System.out.println();
		    System.out.println(ts);
			
		    
		    obj=ts.getFirst();
		    System.out.println();
		    System.out.println(ts);

		    ts.remove(20);
		    System.out.println(ts);
		    
		    ts.reversed();
		    System.out.println(ts);
		    
		    ts.removeLast();
		    System.out.println(ts);
		    }
		 }


