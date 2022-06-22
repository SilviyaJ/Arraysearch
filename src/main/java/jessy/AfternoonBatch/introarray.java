package jessy.AfternoonBatch;

import java.util.Arrays;

public class introarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] colours= {"burgundy","green","black","purple","maroon","red"};
System.out.println(colours.length);
System.out.println(Arrays.toString(colours));
//for (String sil:colours)
//{
//	System.out.println(sil);
//}
for (int base=0;base<colours.length-1;base++)
{
	System.out.println(colours[base]);
}
	}
}
