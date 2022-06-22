package jessy.AfternoonBatch;

import java.util.TreeSet;

public class custreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Bank> get=new TreeSet <Bank>();
		
		Bank b1=new Bank();
		b1.name="sil";b1.place="yercaud";b1.age=24;
		Bank b2=new Bank();
		b2.name="praba";b2.place="ammapet";b2.age=25;
		Bank b3=new Bank();
		b3.name="jes";b3.place="kerala";b3.age=23;
		Bank b4=new Bank();
		b4.name="anu";b4.place="fairlands";b4.age=25;
		
		get.add(b1);get.add(b2);get.add(b3);get.add(b4);
		System.out.println(get);

	}

}
class Bank implements Comparable<Bank>
{
	public String name;
	public String place;
	public Integer age;
	
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", place=" + place + ", age=" + age + "]\n";
	}


	@Override
	public int compareTo(Bank sil) {
		// TODO Auto-generated method stub
//		return this.age.compareTo(sil.age);
//		return sil.age.compareTo(this.age);
//		return this.place.compareTo(sil.place);
		return sil.place.compareTo(this.place);
	}
	
	}

