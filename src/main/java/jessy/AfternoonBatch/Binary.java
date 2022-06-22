package jessy.AfternoonBatch;

public class Binary {
	public static int sell (int[]get,int start,int end,int data) 
	{
	if(end>=start)
		
		{
			int mid=start+(end-start)/2;
			if(get[mid]==data)
			return mid;
			else if(get[mid]<data)
			return sell(get,start,mid-1,data);
			else
				return sell(get,mid+1,end,data);
			
		}
		return -1;
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int [] set= {11,22,33,44,55,66,77,88,99,111};
		System.out.println(Binary.sell(set, 0, set.length-1, 6));
				

	}

}
