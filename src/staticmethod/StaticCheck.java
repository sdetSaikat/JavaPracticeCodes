package staticmethod;

import java.util.Arrays;

public class StaticCheck {
	
	public static void printArray(String arr[]) {
		if (arr.length==1) {
			if(arr[0].equalsIgnoreCase("saikat")) {
				System.out.println(Arrays.toString(arr));
			}
			else {
				System.out.println("not avaialable for the check");
			}
				
		}
		else {
			System.out.println("To big to check the lenth is "+arr.length+
					"currently looks like "+Arrays.toString(arr));
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brr[]= {"Saikat","bulti"};
//		String b[];
//		System.out.println(brr);
//		System.out.println(Arrays.toString(brr));
//		
//		b=brr;
//		System.out.println(Arrays.toString(b));
		
		printArray(brr);
		

	}
	public static void main(String[] arr,int a) {
		// TODO Auto-generated method stub

	}

	
}
