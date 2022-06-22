package jessy.AfternoonBatch;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList link=new LinkedList();
link.add("sil");link.addFirst(10);link.add('g');link.addLast(2.4);link.add(5.6F);
System.out.println(link);
link.remove(2.4);
System.out.println(link);
System.out.println(link.getFirst());
System.out.println(link.getLast());
System.out.println(link.get(2));
link.set(3,"praba");
System.out.println(link);
System.out.println(link.indexOf("sil"));






	}

}

