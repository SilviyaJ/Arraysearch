package jessy.AfternoonBatch;

import java.util.Arrays;

public class Selection {
	public static void call(int[] get)
	{
		for(int hold=0;hold<get.length;hold++) {
			for(int com=hold+1;com<get.length;com++) {
				if(get[hold]<get[com]) {
					int third=0;
					third=get[hold];
					get[hold]=get[com];
					get[com]=third;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set= {94,64,91,37,38};
		Selection.call(set);
		System.out.println(Arrays.toString(set));
		

	}

}
