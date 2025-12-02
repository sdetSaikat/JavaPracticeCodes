package encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Saikat",33,"Irish/CFL",17.5,true);
		Employee e2 = new Employee("Rajat",31,"TGV",16.0,true);
		Employee e3 = new Employee("Tony",28,"Thaipai",11.2,true);
		Employee e4 = new Employee("Vamshi",34,"CFL",14.5,false);
		System.out.println(e1.getName()+"-"+e1.getAge()+"-"+e1.getProject()+"-"+e1.getSalary()+"-After componsation:-"+e1.compensation());
		
		
		
		

	}

}
