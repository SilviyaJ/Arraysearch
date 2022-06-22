package jessy.AfternoonBatch;

import java.util.Arrays;

public class Differentsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] set= {1,2,3,4,5,6};
		float[] get=new float[4];
//		for(int base=0;base<get.length;base++)
//		{
//			get[base]=(float)set[base];
//			System.out.println(Arrays.toString(get));
			
			int []sell=new int[set.length];
			sell=Arrays.copyOfRange(set, 0, sell.length);
			System.out.println(Arrays.toString(sell));
		}

	}

