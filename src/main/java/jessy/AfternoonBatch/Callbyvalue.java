package jessy.AfternoonBatch;
import java.util.Arrays;
public class Callbyvalue {
//	public static void shell(int get)
//	{
//		
//	System.out.println(get+=1);
//	
//		}
//	
	public static void repo (String[] notebook)
	{
		System.out.println(Arrays.toString(notebook));
		notebook[1]+="sil";
		System.out.println(Arrays.toString(notebook));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int set=2;
//		System.out.println(set);
//		shell(3);
//		shell(set);
//	
	String [] lap= {"hp","dell","asus","acer"};
		repo(lap);
       System.out.println(Arrays.toString(lap)); 
	}

}
