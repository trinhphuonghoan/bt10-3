package Chuong4;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreMap {

	public static void main(String[] args) {
		//khai báo 1 TreeMap có tên là treeMap
		//KDL của key là Integer
		//và value là Character
		TreeMap<Integer, Character> treeMap = new TreeMap<Integer, Character>();
		//thêm value vào treeMap với key tương ứng
		//sd phương thức put()
		//đối sô 1 trong put là key có KDL là Integer
		//và đối sô 2 là value có kiểu Character
		treeMap.put(6, 'A');
		treeMap.put(5, 'B');
		treeMap.put(1, 'C');
		treeMap.put(2, 'D');
		treeMap.put(8, 'E');
		//tạo 1 Set có tên là setTreeMap
		//chứa toàn bộ các entry (vừa key vừa value)
		//của treeMap
		Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
		//các entry trong setTreeMap sẽ đc sx tăng dần
		System.out.println("Các entry có trong setTreeMap là:");
		System.out.println(setTreeMap);
	}

}
