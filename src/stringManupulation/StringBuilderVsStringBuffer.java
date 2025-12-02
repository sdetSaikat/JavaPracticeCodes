package stringManupulation;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		System.out.println(sb);
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(5, 11);
		System.out.println(sb);
		System.out.println(sb.length());
		
		
		

	}

}
