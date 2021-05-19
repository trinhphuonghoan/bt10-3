package Chuong4;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList3 {

	public static void main(String[] args) {
		//khai báo 1 ArrayList có tên là arrListChar
		//có kiểu là Char
		ArrayList<Character> arrListChar = new ArrayList<>();
		arrListChar.add('a');
		arrListChar.add('e');
		arrListChar.add('b');
		arrListChar.add('c');
		//khai báo 1 ListIterator có kiểu là Character
		ListIterator<Character> listIterator = arrListChar.listIterator();
		//hiển thị các phần tử có trong arrListChar
		//bằng cách sd ListIterator
		System.out.println("Các phần tử có trong arrListFloat là:");
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + "\t");
		}
	}

}
