package thiskeyword;

public class Student {
	String name;
	int marks;
	char sex;
	
	static int total = 100;
	
//	Student(String name,int marks,char sex)
//	{
//		name=name;
//		marks=marks;
//		sex=sex;
//		
//		
//	}
	public static void display() {
		
		Student s = new Student();
		int a = s.marks;
		int b = total;
	
	}
	
	public void display(int a) {
		a = marks;
		int b = total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println(s1.name+s1.marks+s1.sex);
		

	}

}
