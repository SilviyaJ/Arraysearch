package jessy.AfternoonBatch;

import java.util.Arrays;
import java.util.Scanner;

public class MILEAGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer [] mileage=new Integer[5];
Scanner scan=new Scanner(System.in);
//for (Integer sil:mileage)
//{
//	System.out.println("enter your mileage:");
//	sil=scan.nextInt();
//	System.out.println("entered mileage is:"+sil);
//}
for (int base=0;base<mileage.length;base++)
{
	System.out.println("enter your mileage");
	mileage[base]=scan.nextInt();
	System.out.println("entered mileage is "+mileage[base]);
}
System.out.println(Arrays.toString(mileage));
scan.close();

}
}