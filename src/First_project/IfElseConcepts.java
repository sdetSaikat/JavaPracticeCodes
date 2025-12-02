package First_project;

public class IfElseConcepts {

	public static void main(String[] args) {
		// == operation can be used only on primitive data types
		// Meaning it can only be used with int,short,byte etc
		//It can not be used on the non primitive data types like string class
//		int a= 10;
//		int b= 20;
//		a = a+10;
//		if(a==b) {
//			System.out.println("This is eual");
//		}
//		else {
//			System.out.println("The numbers are not eual");
//		}
//		
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
// largest number out of 4 numbers
		
		int a = 300;
		int b = 600;
		int c = 1000;
		int d = 200;
		
		if (a>b && a>c && a>d ) {
			System.out.println("Variable a is having the value of:"+ a+ " is the largest among all the number");
		}
		else if(b>c && b>d) {
			System.out.println("Variable b is having the value of:"+ b+ " is the largest among all the number");
		}
		else if(c>d) {
			System.out.println("Variable c is having the value of:"+ c+ " is the largest among all the number");
		}
		else {
			System.out.println("Variable d is having the value of:"+ d+ " is the largest among all the number");
		}
		
	
	}

}
