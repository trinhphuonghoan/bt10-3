package Chuong4;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		//init linkedHashMap
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		//add elements to linkedHashMap
		linkedHashMap.put(1, "Java");
		linkedHashMap.put(2, "C++");
		linkedHashMap.put(3, "C#");
		linkedHashMap.put(4, "PHP");
		//show linkedHashMap before remove
		System.out.println("Before remove:");
		show(linkedHashMap);
		//remove element
		linkedHashMap.remove(2);
		//show linkedHashMap after remove
		System.out.println("After remove:");
		show(linkedHashMap);
	}

	private static void show(LinkedHashMap<Integer, String> linkedHashMap) {
		Set<Integer> keySet = linkedHashMap.keySet();
		for(Integer key : keySet) {
			System.out.println(key + " " + linkedHashMap.get(key));
		}
		
	}

}
