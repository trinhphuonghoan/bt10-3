package Chuong4;

import java.util.LinkedList;

public class Linked0 {

	public static void main(String[] args) {
		//khai báo 1 ArrayList có tên là arrListString
		//có kiểu là String
		LinkedList<String> list = new LinkedList<>();
		//thêm các phần tử sử dụng phương thức add()
		list.add("Java");
		list.add("PHP");
		list.add("C#");
		list.add("C++");
		System.out.println("ví dụ sử dụng phương thức addAll()");
		System.out.println("-----------------------");
		//thêm các phẩn tử của list vào listA
		LinkedList<String> listA = new LinkedList<String>();
		listA.addAll(list);
		System.out.print("listA:");
		showList(listA);
		System.out.println("\n ví dụ sử dựng phương thức retainAll()");
		System.out.println("------------------------");
		//khởi tạo listB
		LinkedList<String> listB = new LinkedList<String>();
		listB.add("Java");
		//xóa những phần tử không thuộc listBkhoir listA
		listA.retainAll(listB);
		System.out.print("listA:");
		showList(listA);
		System.out.println("\n ví dụ sử dụng phương thức removeAll()");
		System.out.println("--------------------------");
		//xóa nhưng phần tử thuộc listB khỏi list
		list.removeAll(listB);
		System.out.print("list:");
		showList(list);
	}

	private static void showList(LinkedList<String> list) {
		//show list through for-each
		for(String obj : list) {
			System.out.print("\t" + obj + ", ");
		}
		System.out.println();
	}

}
