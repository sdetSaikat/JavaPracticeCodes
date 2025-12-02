package interfaceConcepts;

public class AlstomIndia extends AlstomFrance implements hrPolicies,performanceMgmt,adminFacilities{
	
	String name;
	int age;
	String profile;
	double salary;
	double experience;
	
	public AlstomIndia(String name,int age,String profile,double salary,double experience) {
		this.name =name;
		this.age = age;
		this.profile= profile;
		this.salary=salary;
		this.experience=experience;
	}
	

	@Override
	public void assetAssignment() {
		if(isEmployeeCheck()) {
		
			if(profile.equalsIgnoreCase("sdet")) 
			{
			
			System.out.println("Provide a Macbook");
			}
		
		else {
			System.out.println("Assign a Desktop");
		}}
		else {
			System.out.println("The employee is not part of the organization");
		}
		
	}

	@Override
	public void travelFacilities() {
		
		System.out.println("No travel facilities! You can claim your expense");
		
	}

	@Override
	public void employeeWelness() {
		
		System.out.println("Quaterly session on mental health !!");
		
	}

	@Override
	public boolean isEmployeeCheck() {
		
		boolean flag = false;
		
		
		if(name.equalsIgnoreCase("Saikat")) 
		{
			flag = true;
		}
		else if(name.equalsIgnoreCase("Rajat")) {
			flag = true;
		}
		else if(name.equalsIgnoreCase("Tony")) {
			flag = true;
		}
		else 
		{
			flag= false;
		}
		
		return flag;
		
	}

	@Override
	public char giveRating() {
		char rating='N';
		switch (name.toLowerCase()) {
		case "saikat":
			rating ='A';
			break;
		case "rajat":
			rating ='B';
			break;
		case "tony":
			rating ='C';
			break;

		default:
			System.out.println("The employee is not part of the organization");
			break;
		}
		
		return rating;
			
	}

	@Override
	public int hikePercentage() {
		int percentage =0;
		if (giveRating()=='A') {
			percentage=10;
			
		}
		else if (giveRating()=='B') {
			percentage=8;
			
		}
		else if (giveRating()=='C') {
			percentage=6;
			
		}
		else {
			System.out.println("Not eligible for the hike");
		}
		
		return percentage;
		
		
		
	}

	@Override
	public void leavePolicies() {
		
		System.out.println("Total 38 leaves are credited at the starting of the year");
	}

	@Override
	public void salaryStructre() {
		double totalSalary =salary+(salary*hikePercentage())/100;
		System.out.println("The gross salaray of "+name +" is:-"+totalSalary);
		
	}

	@Override
	public void employeeInfo() {
		System.out.printf("%s is %d years old!works as %s engineer having %.1f years of experience",name,age,profile,experience);
		
		
	}
	
	public void officeAdress() {
		System.out.println("The office is situated in the Bagmane techpark");
	}


	@Override
	public void employmentRules() {
		System.out.println("Nascom Employment rules are followed by Alstom fully ");
		
	}


	@Override
	public void ethetics() {
		System.out.println("All theree depertment is following company ethicss");
		
	}
	
	public void workingDomain() {
		System.out.println("Astom works in Railway domain");
		
	}
	@Override
	public void payroll() {
		System.out.println("Alstom India payroll");
		
	}
	
	@Override
	public void timingRegulations() {
		System.out.println("AlstomIndia is following a 10 to 4 core working hours");
		
	}


}
