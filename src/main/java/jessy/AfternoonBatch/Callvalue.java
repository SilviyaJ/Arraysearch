package jessy.AfternoonBatch;

import java.util.Arrays;

public class Callvalue {
	public static void praba(double jes)
	{
		System.out.println(jes*2);
	}
	 
public static void gopi(int[] b)
{
	System.out.println(Arrays.toString(b));
	b[2]+=1;
	System.out.println(Arrays.toString(b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sil=2.1;
		System.out.println(sil);
		praba(3.1);
		praba(sil);
		
		int [] a= {1,2,3,4,5};
		gopi (a);
		System.out.println(Arrays.toString(a));

	}

}
