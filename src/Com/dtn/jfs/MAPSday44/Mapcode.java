package Com.dtn.jfs.MAPSday44;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Mapcode {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Rohit");
		hm.put(2, "Virat");
		hm.put(3, "Bumrah");
		hm.put(4, "Ashwin");
		hm.put(5, "Jadeja");
		hm.put(6, "siraj");
		System.out.println(hm);
		
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		hm1.put("Rohit",1);
		hm1.put("Virat",2);
		hm1.put("Bumrah",3);
		hm1.put("Ashwin",4);
		hm1.put("Jadeja",5);
		hm1.put("siraj",6);
		System.out.println(hm1);
		
		HashMap<Integer,String> hm_copy=(HashMap<Integer,String>)hm.clone();
		System.out.println(hm_copy);
		
		boolean res1=hm.containsKey(6);
		System.out.println(res1);

		res1=hm.containsKey(60);
		System.out.println(res1);
		
		res1=hm.containsValue("Sachin");
		System.out.println(res1);
		
		res1=hm.containsValue("Ashwin");
		System.out.println(res1);
		
		String str_res=hm.get(10);
		System.out.println(str_res);
		
		Class cls=hm.getClass();
		System.out.println(cls);
		
		String str_res1=hm.getOrDefault(10,"No Dta Found");
		System.out.println(str_res1);
		
		str_res1=hm.getOrDefault(1,"No Dta Found");
		System.out.println(str_res1);
		
		int hashCode=hm.hashCode();
		System.out.println(hashCode);
		
		
		boolean empty=hm.isEmpty();
		System.out.println(empty);
		
//		hm.clear();
//		empty=hm.isEmpty();
//		System.out.println(empty);
		
		Set<Integer>keySet=hm.keySet();
		Iterator<Integer> itr=keySet.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
		
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm.put(12, "Rohit_son");
		hm.put(12, "Virat_son");
		hm.put(13, "Bumrah_son");
		hm.put(14, "Ashwin_son");
		hm.put(15, "Jadeja_son");
		hm.put(16, "siraj_son");
		System.out.println(hm2);
		hm.putAll(hm2);
		System.out.println(hm);
		
		for(Object o:hm.values()) {
			System.out.println(o);
		}
		
		
	}

}
