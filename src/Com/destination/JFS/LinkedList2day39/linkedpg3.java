package Com.destination.JFS.LinkedList2day39;

import java.util.LinkedList;

public class linkedpg3 {
		public static void main(String[] args) {
			LinkedList ll = new LinkedList();
			ll.add(10);
			ll.add(15);
			ll.add(20);
			ll.add(25);
			ll.add(30);
			ll.add(40);
			System.out.println(ll);
			
			/*Object obj=ll.get(4);
			System.out.println(obj);
			
//			obj = ll.get(10);
//			System.out.println(obj);

			obj = ll.getClass();
			System.out.println(obj);
			
			obj = ll.getFirst();
			System.out.println(obj);
			
			obj = ll.getLast();
			System.out.println(obj);
			
			obj = ll.hashCode(); //Hashcode is unique number
			System.out.println(obj);
			
			obj = ll.indexOf(5);
			System.out.println(obj);
			
			obj = ll.isEmpty();
			System.out.println(obj);
			
			ll.clear();
			
			obj = ll.isEmpty();
			System.out.println(obj);
			
			obj=ll.lastIndexOf(obj);
			System.out.println(obj);*/
			
			System.out.println(ll);
			
			ll.offer(200);//its change the value of last
			System.out.println(ll);
			
			ll.offerFirst(2000);//its change the value of first 
			System.out.println(ll);
			
			ll.offerLast(488);//its change the value of last
			System.out.println(ll);
			
			ll.peek();//same values available like that only..there is no change
			System.out.println(ll);
			
			ll.peekFirst();//same values available like that only..there is no change
			System.out.println(ll);
			
			ll.peekLast();//same values available like that only..there is no change
			System.out.println();
			
			ll.poll();//removing values
			System.out.println(ll);
			
			ll.pollFirst();//removing first value
			System.out.println(ll);
			
			ll.pollLast();//removing last values
			System.out.println(ll);
			
			
			
			
		}
	}




