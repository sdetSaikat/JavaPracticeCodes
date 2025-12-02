package constructor;

public class Person {
	
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String name,int age,char gender,double height) {
		this.name= name;
		this.age= age;
		this.gender= gender;
		this.height= height;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Saikat",33,'M',5.11);
		System.out.println(p.name +"-"+p.age+"-"+p.gender+"-"+p.height);
		Person s = new Person("Subhasri",34,'F',5.4);
		System.out.println(s.name +"-"+s.age+"-"+s.gender+"-"+s.height);
		
		
	}

}
