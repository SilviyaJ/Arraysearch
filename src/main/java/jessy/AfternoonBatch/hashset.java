package jessy.AfternoonBatch;

import java.util.HashSet;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet list1= new HashSet();
		list1.add("mango");list1.add("grapes");list1.add("kiwi");list1.add("litchi");
		list1.add("apple");list1.add("papaya");
		System.out.println(list1);
		
		TreeSet list2= new TreeSet();
		list2.addAll(list1);
		System.out.println(list2);
		
		list1.remove("apple");
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.contains("apple"));
		System.out.println(list2.contains("kiwi"));

	}

}
