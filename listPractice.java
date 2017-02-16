package Collections;

import java.util.*;

public class listPractice {

	public static void main(String args[]){
		List<String> list1 = new ArrayList<>();
		
		list1.add("Bob");
		list1.add("Mariam");
		list1.add("Lucy");
		list1.add("Bill");
		System.out.println(list1);
		list1.remove("Mariam");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Shannon");
		list2.add("Shannon");
		list2.add("Grant");
		list2.add("Dustin");
		
		list2.addAll(list1);
		list2.remove("Shannon");
		System.out.println(list2);
		
			
	}

}
