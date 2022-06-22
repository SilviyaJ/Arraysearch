package jessy.AfternoonBatch;

import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList link=new LinkedList();
link.add("sil");link.addFirst("jes");link.addLast("praba");link.add("karan");
System.out.println(link);
link.remove("jes");
System.out.println(link);
//link.removeFirst();
//System.out.println(link);
//link.removeLast();
//System.out.println(link);
System.out.println(link.getFirst());
System.out.println(link.getLast());
System.out.println(link.get(1));
link.set(2,"KM");
System.out.println(link);
System.out.println(link.indexOf("praba"));

	}

}
