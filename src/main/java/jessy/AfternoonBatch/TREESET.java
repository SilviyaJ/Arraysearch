package jessy.AfternoonBatch;

import java.util.TreeSet;

public class TREESET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<School> person=new TreeSet<School>();
		School s1=new School();s1.name="sil";s1.age=23;s1.place="yercaud";
		School s2=new School();s2.name="praba";s2.age=24;s2.place="ammapet";
		School s3=new School();s3.name="anu";s3.age=25;s3.place="fairlands";
		System.out.println(s1);
		person.add(s1);person.add(s2);person.add(s3);
		System.out.println(person);
		}
	}
		
class School implements Comparable<School>
{
	@Override
	public String toString() {
		return "School [name=" + name + ", age=" + age + ", place=" + place + "]\n";
	}
	public String name;
	public Integer age;
	public String place;
	@Override
	public int compareTo(School jes) {
		// TODO Auto-generated method stub
		return this.place.compareTo(jes.place);
//		return jes.age.compareTo(this.age);
//		return 0;
	}
	
}
	 
	 
 

