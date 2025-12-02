package First_project;

public class CharecterOperation {

	public static void main(String[] args) {
		char ch1='A';
		System.out.println("The value of Ch1:-"+ch1);
		char ch2= 66;
		System.out.println("The value of Ch2:-"+ch2);
		int store_Ascii = 'C';
		System.out.println("The value of store_Ascii:-"+store_Ascii);
		int nrml_int = 68;
		System.out.println("Typecast value of nrml_int:-"+(char)nrml_int);
		
		System.out.println("Arithmatic operation on character:-"+(ch1+ch2));
		
		
		
		int a= 10;
		int b= 20;

		
		System.out.println(a+b+"Saikat"+ch1+ch2);//30SaikatAB
		System.out.println(ch1+ch2+"Saikat"+a+b);//131Saikat1020
		
		
		System.out.println(ch1+ch2+"Saikat"+(a+b));//131Saikat30
		
		if((ch1+ch2+"Saikat"+a+b) instanceof String){
			System.out.println("string is the super class");
			
		}

			
			
		}
		

	}


