package encapsulation;

public class Employee {
	private String name;
	private int age;
	private String project;
	private double salary;
	private boolean isActive;
	
	public Employee(String name, int age, String project, double salary,boolean isActive) {
		if(isActive) {
			this.name = name;
			this.age = age;
			this.project = project;
			this.salary = salary;
			
			}
		else {
			System.out.println(name+"is not part of the employee");
		}
	}

	public double compensation() {
		double percentage=0.0;
		
		if (checkRating()>3.0 && checkRating()<4.0) {
			percentage = 7.5;
		}
		else if (checkRating()<3.0) {
			percentage = 0.0;
			
		}
		else if (checkRating()>=4.0) {
			percentage = 14.0;
			
		}
		
		salary = salary+(salary*percentage)/100;
		return salary;
		
	}
	
	private double checkRating() {
		double rating =-1.0;
		
		switch (name) {
		case "Saikat":
			rating = 3.5;
			break;
		case "Rajat":
			rating = 0.0;
			break;
		case "Tony":
			rating = 4.0;
			break;

		default:
			System.out.println("performance needs to be better");
			break;
		}
		
		return rating;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1 = new Employee();
//		System.out.println(e1.name+"-"+e1.age+"-"+e1.project+"-"+e1.salary + "The salary after componsation :-"+e1.compensation());

	}

	

}
