package jessy.AfternoonBatch;

import java.util.Arrays;

public class Upgrade {
	public static void praba(char[] sil, byte[] jes)
	{
		for (int base=0;base<sil.length;base++)
		{
			jes[base]=(byte) sil[base];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] get = {'s','i','l','v','i','y','a'};
		byte[] set=new byte[get.length];
		praba(get,set);
		System.out.println(Arrays.toString(set));

	}

}
