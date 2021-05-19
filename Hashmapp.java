package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmapp {
	public static void main(String[] args) {
		//khai báo 1 HashMap có tên là hashMap
		//kiểu dữ liệu của key và value là String
		HashMap<String, String> hashMap = new HashMap<>();
		//Thêm value vào trong hashMap với key có kiểu là String
		//sd phương thức put()
		//đối số thứ nhất trong put là key có kiểu là String
		//và đối số thứ 2 là value có kiểu là String
		hashMap.put("CSLT", "Cơ sở lập trình");
		hashMap.put("C++", "C++");
		hashMap.put("C#", "C Sharp");
		hashMap.put("PHP", "PHP");
		hashMap.put("Java", "Java");
		//tạo 1 Set có tên là setHashMap
		//chứa taofn bộ các entry (vừa key vừa value)
		//của hashMap
		Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
		System.out.println("Các entry có trong setHashMap:");
		System.out.println(setHashMap);
	}
}
