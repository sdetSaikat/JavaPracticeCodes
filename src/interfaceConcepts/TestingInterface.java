package interfaceConcepts;

public class TestingInterface {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		AlstomIndia e1=new AlstomIndia("Saikat", 33,"Sdet", 20.5,9.2);
		e1.employeeInfo();
		System.out.println();
		e1.headoffice();
		e1.assetAssignment();
		e1.employeeWelness();
		e1.payroll();
		e1.hikePercentage();
		e1.salaryStructre();
		e1.officeAdress();
		e1.employmentRules();
		e1.workingDomain();
//		System.out.println(AlstomIndia.helpdeskNumber);
		Nasscom.helpDesk();
	
		
		
		//Topcasting concept
		System.out.println("***********************");
		adminFacilities ad =new AlstomIndia("Rajat", 33,"Embeded Tester", 16.0,10);
		ad.employmentRules();
		ad.assetAssignment();
		ad.employeeWelness();
		ad.travelFacilities();
		
		
		//Interface type casting
		
		System.out.println("******************");
		hrPolicies hr=(hrPolicies)ad;
		hr.employeeInfo();
		System.out.println();
		hr.salaryStructre();
	
		
		//downcasting
//		Alstom a =(Alstom)new adminFacilities(); 
		
		
		

		

	}

}
