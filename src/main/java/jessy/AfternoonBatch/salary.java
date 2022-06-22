package jessy.AfternoonBatch;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] salary=new Integer[2];
String [] name= {"praba","jessy"};
Scanner object=new Scanner(System.in);
for (int base=0;base<salary.length;base++)
{
	System.out.println("your name is"+name[0]);
	System.out.println("enter your salary details:");
	salary[base]=object.nextInt();
	System.out.println("entered salary is"+salary[base]);
}

	}

}
