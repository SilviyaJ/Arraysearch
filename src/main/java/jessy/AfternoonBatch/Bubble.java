package jessy.AfternoonBatch;

import java.util.Arrays;

public class Bubble {
	public static void numbers(int[] get)
	{
		int third=0;
		for(int pos=0;pos<get.length-1;pos++)
		{
			for(int cur=0;cur<get.length-pos-1;cur++)
			{
				if(get[cur]>get[cur+1])
				{
				third=get[cur];
				get[cur]=get[cur+1];
				get[cur+1]=third;
					
				}
			}
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set= {34,75,49,83,24};
		Bubble.numbers(set);
		System.out.println(Arrays.toString(set));
	}

}
