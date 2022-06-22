package jessy.AfternoonBatch;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);

	System.out.println("submit your ITR");
	System.out.println("TELL US YOUR NAME:");
	String username=s.nextLine();
	System.out.println("tell your profession:");
	String profession=s.nextLine();
	System.out.println("tell me your contact number:");
	long mobilenumber=s.nextLong();
	System.out.println("tell me your income:");
	double annualincome=s.nextDouble();
	System.out.println("tell me your emailid:");
	String email=s.nextLine();
	
	System.out.println("thanks for submitting your ITR Miss/Mr"+username+"of the profession"+profession +"has an income of"+annualincome+"futher details hasbeen sent to your"+email+ "and"+mobilenumber);
	s.close();
}
}