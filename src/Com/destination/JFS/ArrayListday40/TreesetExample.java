package Com.destination.JFS.ArrayListday40;

import java.util.TreeSet;

public class TreesetExample {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>();
        tr.add(100);
        tr.add(150);
        tr.add(200);
        tr.add(250);
        tr.add(300);
        tr.add(400);
        System.out.println(tr);
        System.out.println("*");
    

        Object o = tr.pollFirst();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");


        o = tr.pollLast();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.getClass();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.ceiling(10);
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");
    
    
        o = tr.floor(55);
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.clone();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.higher(150);
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.last();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.lower(100);
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.toArray();
        System.out.println(java.util.Arrays.toString((Object[]) o));
        System.out.println(tr);
        System.out.println("*");

        o = tr.toString();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.add(15);
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.contains(15);
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        int hashCode = tr.hashCode();
        System.out.println(hashCode);
        System.out.println(tr);
        System.out.println("*");

        o = tr.descendingIterator();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.descendingSet();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o = tr.headSet(18);
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        o  = tr.isEmpty();
        System.out.println(o);
        System.out.println(tr);
        System.out.println("*");

        tr.clear();
        System.out.println(tr.isEmpty());
        System.out.println(tr);
        System.out.println("*");
        }
    }
