package jessy.AfternoonBatch;

public class Searching {
//	public static int colors (String[]get,String match)
//	{
//		for(int index=0;index<get.length;index++)
//		{
//			if(get[index].equalsIgnoreCase(match))
//			{
//				return index;
//			}
//		}
//		return -1;
//		 
//	}
//	public static void print(int start,int end)
//	{
//		if(end>=start)
//		{
//			System.out.println("hello"+start);
//			Searching.print(start+1, end);
//		}
//	}
	public static void recursive(String[]arr,int start,int end)
	{
		if(end>=start)
		{
			System.out.println(arr[start]);
			recursive(arr,start+1,end);
		}
		
	}
	
	
	

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
	String[] set= {"green","blue","black","red","pink"};
//	System.out.println(Searching.colors(set,"pink"));
//		Searching.print(10, 20);	
	Searching.recursive(set, 0, set.length-1);
	}
		
	}


