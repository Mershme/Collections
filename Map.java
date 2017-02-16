
package Collections;

import java.util.*;

public class Map {

	public static void main(String args[]){
		
		
	HashMap newCandy = new HashMap();	
		newCandy.put("Snickers "," 1");
		newCandy.put("Butterfinger "," 4");
		newCandy.put("Milky Way ", " 2");
		newCandy.put("100 Grand "," 18");
		newCandy.put("Hershey's Bar ", " 3");
		System.out.println(newCandy);
		
		newCandy.remove("Snickers ");
		newCandy.put("Butterfinger ", " 35");
		System.out.println(newCandy);
		
		newCandy.put("Sour Patch Kids", "5");
		System.out.println(newCandy);
	
	}
	
}
