package methodoverloading;

import First_project.CharecterOperation;

public class MethodOverloading {
	
	// WAF- AC: 0 to 100
	// getStudentMarks(String studentName)
	// if student is available: return student marks (int)
	// else: return : int : -1
	
	public double getEmployeeSalary(String employeeName)
	{
		double salary=-1;
		
		switch (employeeName.trim().toLowerCase()) {
		case "saikat":
			salary=18.88;
			break;
		case "rajat":
			salary=16.00;
			break;
		case "tony":
			salary=13.95;
			break;
		case "kamal":
			salary=17.95;
			break;

		default:
			System.out.println(employeeName+" is not part of the organisation anymore");
			break;
		}
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m1 = new MethodOverloading();
//		String emp[]= {"Saikat","Rajat","Tony","kamal","Vamshi","Bhupal"};
//		System.out.println("Getting the salary for each employee....");
//		System.out.println();
//		for(int i =0;i<emp.length;i++) 
//		{
//			if(emp[i].equalsIgnoreCase("vamshi") ||emp[i].equalsIgnoreCase("Bhupal")) {
//				m1.getEmployeeSalary(emp[i]);
//			}
//			else {
//				System.out.print(emp[i] + " has total salary of:- "+ m1.getEmployeeSalary(emp[i])+"--->");
//				if (emp[i].trim().equalsIgnoreCase("Tony")) {
//				System.out.println("software engineer");
//				}
//				else 
//				{
//					System.out.println("Senior software engineer");
//				
//				}
//		}
//		
//
//	}
		CharecterOperation ch1 = new CharecterOperation();
		Browser br1=new Browser("CHrome");
		
		if (br1.checkBrowser()) {
			System.out.println("Enter the url");
		}
		else
		{
			System.out.println("Check for the available browser");
		}

}
}
