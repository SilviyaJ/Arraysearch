package jessy.AfternoonBatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Arrayvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sell=new ArrayList<String>();
		Vector<String> bell=new Vector<String>();
		sell.add("sil");sell.add("jes");sell.add("praba");sell.add("karan");
		System.out.println(sell);
		bell.addAll(sell);
		System.out.println(bell);
		sell.remove(2);
		System.out.println(sell);
		System.out.println(bell);
	bell.remove("sil");
	System.out.println(bell);
	System.out.println(sell.get(1));
	bell.set(2,"praba");
	System.out.println(bell);
	sell.retainAll(bell);
	System.out.println(sell);
	sell.removeAll(bell);
	System.out.println(sell);
	
	Collections.sort(bell);
	System.out.println(bell);
	Collections.reverse(bell);
	System.out.println(bell);
	Collections.replaceAll(bell,"praba","karan");
	System.out.println(bell);
	System.out.println(Collections.max(bell));
	System.out.println(Collections.min(bell));
		
		
		
		
		
	}

}
