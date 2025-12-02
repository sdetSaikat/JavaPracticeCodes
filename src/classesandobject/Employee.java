package classesandobject;

public class Employee {
	String name;
	int age;
	String sex;
	int emp_id;
	String dept;
	
	static boolean isEmployee=false;
	
	public void isTimeSheetFilled(boolean flag) 
	{
		if(flag== true)
		{
			System.out.println("The timesheet is filled.Good Job msg from Lijo!!");
		}
		else
		{
			System.out.println("The timesheet is filled.Good Job msg from Lijo!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 =new Employee();
		emp1.name="Saikat maity";
		emp1.emp_id=508760;
		emp1.sex="Male";
		emp1.dept="VSDC";
		emp1.age=33;
//		emp1.isEmployee=false;
		
		
		Employee emp2 =new Employee();
		emp2.name="Rajat";
		emp2.emp_id=503336;
		emp1.sex="Male";
		emp2.dept="VSDC";
		emp2.age=31;
		
		Employee emp3 =new Employee();
		emp3.name="Tony";
		emp3.emp_id=504336;
		emp3.sex="Male";
		emp3.dept="VSDC";
		emp3.age=28;
		
		Employee emp4 =new Employee();
		emp4.name="Lavanya";
		emp4.emp_id=408116;
		emp4.sex="Female";
		emp4.dept="VSDC";
		emp4.age=30;
		
//		emp1= null;
		System.out.println("The Employee "+emp1.name+" is "+emp1.age+" years old"+" emp id is: "+emp1.emp_id +" is a "+emp1.sex +",works for "+emp1.dept+" department");
		System.out.println("The Employee "+emp2.name+" is "+emp2.age+" years old"+" emp id is: "+emp2.emp_id +" is a "+emp2.sex +",works for "+emp2.dept+" department");
		System.out.println("The Employee "+emp3.name+" is "+emp3.age+" years old"+" emp id is: "+emp3.emp_id +" is a "+emp3.sex +",works for "+emp3.dept+" department");
		System.out.println("The Employee "+emp4.name+" is "+emp4.age+" years old"+" emp id is: "+emp4.emp_id +" is a "+emp4.sex +",works for "+emp4.dept+" department");
		
		emp1=emp2;//emp1=Rajat;
		emp2=emp3;//emp2=Tony;
		emp3=emp4;//emp3=Lavanya;
		emp4=emp1;//emp4=Rajat;
		
		//Saikat object will be left with no reference in the Heap memory. 
		
		System.out.println("******************************");
		System.out.println("The Employee "+emp1.name+" is "+emp1.age+" years old"+" emp id is: "+emp1.emp_id +" is a "+emp1.sex +",works for "+emp1.dept+" department");
		System.out.println("The Employee "+emp2.name+" is "+emp2.age+" years old"+" emp id is: "+emp2.emp_id +" is a "+emp2.sex +",works for "+emp2.dept+" department");
		System.out.println("The Employee "+emp3.name+" is "+emp3.age+" years old"+" emp id is: "+emp3.emp_id +" is a "+emp3.sex +",works for "+emp3.dept+" department");
		System.out.println("The Employee "+emp4.name+" is "+emp4.age+" years old"+" emp id is: "+emp4.emp_id +" is a "+emp4.sex +",works for "+emp4.dept+" department");
		
		
		
		
		
		

	}

}
