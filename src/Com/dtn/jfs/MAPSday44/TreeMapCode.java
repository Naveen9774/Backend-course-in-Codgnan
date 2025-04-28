package Com.dtn.jfs.MAPSday44;
	
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCode {
	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(1, "Z");
		hm.put(2, "R");
		hm.put(3, "F");
		hm.put(4, "K");
		hm.put(5, "T");
		hm.put(6, "L");
		System.out.println(hm);
		

		TreeMap<Integer,String>hm_copy=new TreeMap<Integer,String>();
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
		
		TreeMap<Integer,String> hm2=new TreeMap<Integer,String>();
		hm.put(12, "Z_1");
		hm.put(12, "R_2");
		hm.put(13, "F_3");
		hm.put(14, "F_4");
		hm.put(15, "K_5");
		hm.put(16, "T_6");
		hm.put(16, "L_7");
		System.out.println(hm2);
		hm.putAll(hm2);
		System.out.println(hm);
		
		for(Object o:hm.values()) {
			System.out.println(o);
		}
		
		
	}
	

}
