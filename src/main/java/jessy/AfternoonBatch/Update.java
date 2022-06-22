package jessy.AfternoonBatch;

import java.util.Arrays;
import java.util.Scanner;

public class Update {
	static Scanner s=new Scanner(System.in);
//	public static void number(int[] get,int pos)
//	{
//		System.out.println("tell me the no "+pos);
//		get[pos]=s.nextInt();
//		
//	}
	public static void UPCondition(String[] third,String match)
	{
		for(int index=0;index<third.length;index++)
		{
			if(third[index].contains(match))
			{
				System.out.println("tell me the name"+third[index]);
				third[index]=s.next();
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] set= {1,2,3,4,5,7};
//		Update.number(set, 5);
//		System.out.println(Arrays.toString(set));
		
		String[] set= {"sil","jes","praba","anu"};
	Update.UPCondition(set,"nu");
	System.out.println(Arrays.toString(set));

	

	}

}
