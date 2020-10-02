package JavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		//1 Compare each element; 0(nxn) worset solution 
		
		for (int i = 0; i<names.length; i++) {
			for (int j = i+1; j<names.length; j++) {
				if (names[i].equals(names[j])){
					System.out.println("Duplicate element is "+names[i]);
				}
			}
		}
		
		//2  HashSet: Java Collection: it stores unique values; 0(n)
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate element is "+name);
			}
		}
		
		//using HashMap
		
		Map<String, Integer> storeMap = new HashMap <String, Integer>();
		
		for (String name : names) {
			Integer count = storeMap.get(name);
			
		}
	}

}
