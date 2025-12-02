package First_project;

import java.util.Arrays;

public class ArrayConcept {
	public static void main(String args []) {
		
		System.out.println(Arrays.toString(args));
		//integer array
//		int a[] = new int[5];
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
//		
//		int b[]= {1,2,3,5,5};
//		boolean flag= false;
//		if(a.length ==b.length) 
//		{
//			for (int k=0;k<a.length;k++) 
//			{
//				if(a[k]!=b[k])
//				{
//					System.out.println("Bye!!!");
//					flag= false;
//					break;
//				}
//				else
//				{
//					flag= true;
//					
//				}
//			}
//		}
//		else
//		{
//			System.out.println("Invalid comparison");
//		}
//		
//		if(flag==true) 
//		{
//			System.out.println("Both the array's are  same!!!");
//		}
//		else {
//			System.out.println("Both the array's are not same!!!");
//		}
//			
		
		Object obj[]=new Object[5];
		obj[0]="Saikat";
		obj[1]=33;
		obj[2]='M';
		obj[3]=18.88;
		obj[4]="Alstom";
		System.out.println(Arrays.toString(obj));
		
		for(Object e:obj)
		{
			if(e.equals("Alstom")) {
				System.out.println("Alstom was destroying you. You know Why you have taken this decition\n");
				break;
			}
			else
			{
				System.out.println(e);
			}
			
		}
		System.out.println("you have done a great job now focus on the job with full heart.\nThis is your last chance for your future\nAll the best!!");
		
		
		double f[]= {1.0f,2,0,3,0.0,4,5.0f};
		char ch[] = new char[5];
		String sh[]= {"saikat","Subhasri","Bibhas","Riyona","Suraj","shreyansh"};
		System.out.println(sh.length);
		System.out.println(Arrays.toString(sh));
		String name[]=new String[5];
		name[0]="saikat";
	}


}




	


