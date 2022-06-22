package jessy.AfternoonBatch;

public class Deletion {
	public static void horse(String[] whale)
	{
		for(String p:whale)
		{
			System.out.print(p+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] shark= {"sil","praba","jes","anu","gopi"};
		shark [3]=null;
		Deletion.horse(shark);
		
		

	}

}
