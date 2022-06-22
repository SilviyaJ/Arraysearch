package jessy.AfternoonBatch;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;



public class MAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> subject=new Hashtable<String,Integer>();
		subject.put("eng", 98);subject.put("tam", 97);subject.put("mat", 97);
		subject.put("sci", 98);subject.put("soc", 99);
	System.out.println(subject);
	TreeMap<String,Integer> mark=new TreeMap<String,Integer>();
	mark.putAll(subject);
	System.out.println(mark);
	mark.remove("soc");
	System.out.println(subject.containsKey("soc"));
	System.out.println(mark.containsValue(99));
	
Collection<Integer> cell=mark.values();
System.out.println(cell);

Set<String> gell=subject.keySet();
System.out.println(gell);
		
	}

}


