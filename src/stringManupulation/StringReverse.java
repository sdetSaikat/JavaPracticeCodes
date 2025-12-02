package stringManupulation;

public class StringReverse {
	
	public String reersingAstring(String s) {
		String reversed_string = "";
		
		
		try{
			if(s==null) 
			{
				throw new NullPointerException("Can not reverse a null value ");
			}
			}
		
		catch(NullPointerException n) {
			System.out.println("Exception is found");
			return null;
			
		}
		
		if(s.length()== 1|s.length()== 0) {
			return s;
		}
		
		for(int i =s.length()-1; i>=0;i--) {
			reversed_string = reversed_string+s.charAt(i);
		}
		
		
		return reversed_string;
	}

	public static void main(String[] args) {
		
		StringReverse s = new StringReverse();
		s.reersingAstring(null);
		
		String rs =s.reersingAstring("selenium");
		System.out.println(rs);
		
		Integer x = 5;
		int b = x.intValue();
	}

}
