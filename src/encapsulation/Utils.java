package encapsulation;

import java.util.Arrays;

public class Utils {
	
	String Name;
	int age;
	
	private Utils(String Name,int age) {
		this.Name=Name;
		this.age=age;
	}

	public static void main(String[] args) {
		Utils u = new Utils("Saikat",33);
		String a[] = {};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		System.out.println(u.Name);

	}

}
