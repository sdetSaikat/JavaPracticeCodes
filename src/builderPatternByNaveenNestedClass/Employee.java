package builderPatternByNaveenNestedClass;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private String officeName;
	private String designation;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getOfficeName() {
		return officeName;
	}
	public String getDesignation() {
		return designation;
	}
	
	//in the main class setters options are given in case user want to update the the values later.
	//in case we want to create a complete immutable object in that case do'nt need to write the setters.
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	private Employee(EmployeeBuilder emp) {
		this.name = emp.name;
		this.age = emp.age;
		this.salary = emp.salary;
		this.officeName = emp.officeName;
		this.designation = emp.designation;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", officeName=" + officeName
				+ ", designation=" + designation + "]";
	}



	public static class EmployeeBuilder{
		//Lets say name Name and designation is mandadory
		private String name;
		private int age;
		private double salary;
		private String officeName;
		private String designation;
		
		// in case we don't want to give this consturctor option instead
		//we want to give the choice to the user to select  for which you want assign values for which you don't want 
		//in that case delete this constructor and create setters  for all the fields.
		public EmployeeBuilder(String name,String designation) {
			this.name= name;
			this.designation=designation;
		}

		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeBuilder setOfficeName(String officeName) {
			this.officeName = officeName;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
		
		
		
	}
	
	
	
	

}
