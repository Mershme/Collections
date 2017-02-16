
package Collections;

import java.util.*;

public class Set {

	public static void main(String args[]){
		
		/* A set cannot contain duplicate elements*/
	HashSet name1 = new HashSet();	
		name1.add("P");
		name1.add("R");
		name1.add("E");
		name1.add("S");
		name1.add("T");
		name1.add("O");
		name1.add("N");
		name1.add("R");
		System.out.println(name1);
		/* if a collection already exists, you can convert it to a hashset if you want an easy way
		 * to get rid of duplicates.
		 */
		
		System.out.println( name1.contains("P"));
		
		
		LinkedHashSet name2 = new LinkedHashSet();
			name2.add("S");
			name2.add("T");
			name2.add("E");
			name2.add("R");
			name2.add("L");
			name2.add("I");
			name2.add("N");
			name2.add("G");
			System.out.println(name2);
		
			name2.remove("S");
			System.out.println(name2);
		
			Iterator iterator = name2.iterator();
			while(iterator.hasNext()){
				String newName = (String) iterator.next();
				System.out.println(newName);
			}
			
			TreeSet tree = new TreeSet(name2);
			System.out.println(tree);
	}

}
