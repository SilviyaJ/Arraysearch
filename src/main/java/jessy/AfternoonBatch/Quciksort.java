package jessy.AfternoonBatch;

import java.util.Arrays;

public class Quciksort {
	public static int well(int[]get,int start,int end)
	{
		int pidata=get[end];
		int initial=start-1;
		for(int cur=start;cur<end;cur++)
		{
			if(get[cur]>pidata)
			{
				initial++;
				int third=get[cur];
				get[cur]=get[initial];
				get[initial]=third;
			}
		}
		int third=get[initial+1];
		get[initial+1]=get[end];
		get[end]=third;
		return initial+1;
		
	}
	public static void gell(int[]sell,int start,int end)
	{
		if(end>start)
		{
			int pipoint=well(sell,start,end);
			gell(sell,start,pipoint-1);
			gell(sell,pipoint+1,end);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set= {89,34,13,24,73,85};
		Quciksort.gell(set, 0, set.length-1);
		System.out.println(Arrays.toString(set));
			

	}

}
