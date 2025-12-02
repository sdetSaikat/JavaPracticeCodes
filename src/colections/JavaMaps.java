package colections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMaps {

	public static void main(String[] args) {
		HashMap<String,Integer> marksmap = new HashMap<String,Integer>();
		System.out.println(marksmap);
		marksmap.put("Saikat", 0);
		marksmap.put("Rajat", 17);
		marksmap.put("Bibhas", 35);
		marksmap.put("Suraj", 34);
		marksmap.put("Suraj", null);
		marksmap.put(null, null);
		System.out.println(marksmap);
		System.out.println(marksmap.get("Suraj"));
		marksmap.put(null, null);
		System.out.println(marksmap);
		marksmap.put(null, 15);
		System.out.println(marksmap);
		
		Map<String,Integer> Salmap ;
//		Salmap = new TreeMap<String, Integer>();
//		Salmap.put(null,50);
		Salmap= new LinkedHashMap<String, Integer>();
		Salmap.put("Saikat", 0);
		Salmap.put("Rajat", 17);
		Salmap.put("Bibhas", 35);
		Salmap.put("Suraj", 34);
		Salmap.put(null, 50);
		
		System.out.println(Salmap);
		
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
	}

}
