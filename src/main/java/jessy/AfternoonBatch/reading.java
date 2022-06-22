package jessy.AfternoonBatch;

import java.util.Scanner;

public class reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] set= {"blue","green","red","purple","brown","black"};
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("tell me the color at position:");
//		int get=scan.nextInt();
//		System.out.println("the color at:"+get+set[get]);
//		System.out.println("the color at:"+get+set[get-2]);
//		
		System.out.println("tell me the color starts with");
		String colors=scan.next();
		for(String pointer:set)
		{
			if(pointer.startsWith(colors))
					System.out.println(pointer);
		}
		scan.close();
 
	}

}
