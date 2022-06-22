package jessy.AfternoonBatch;

import java.util.Iterator;
import java.util.Stack;

public class Demostack {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Stack set= new Stack();
		
		set.push(10);set.push("sil");set.push('p');set.push(2.5);
		System.out.println(set);
		set.pop();
		System.out.println(set);
		System.out.println(set.peek());
		System.out.println(set.search("sil"));
		set.clear();
		System.out.println(set.isEmpty());
 
 
	}
}