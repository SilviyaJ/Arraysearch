package jessy.AfternoonBatch;

import java.util.Arrays;
import java.util.Scanner;

public class Scannerarray {
	public static void praba(String[] jes)
	{
		Scanner scan=new Scanner(System.in);
		for (int pos=0;pos<jes.length;pos++)
		{
			System.out.println("enter value at:"+pos+"is");
			jes[pos]=scan.next();
		
		}
		scan.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] sil=new String[5];
System.out.println(Arrays.toString(sil));
praba(sil);
System.out.println(Arrays.toString(sil));
	}

}
