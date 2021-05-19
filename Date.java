package Chuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//khai báo 1 danh sách liên kết
		//lưu trữ các tháng trong năm
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Tháng 1");
		linkedList.add("Tháng 2");
		linkedList.add("Tháng 3");
		linkedList.add("Tháng 4");
		linkedList.add("Tháng 5");
		linkedList.add("Tháng 6");
		linkedList.add("Tháng 7");
		linkedList.add("Tháng 8");
		linkedList.add("Tháng 9");
		linkedList.add("Tháng 10");
		linkedList.add("Tháng 11");
		linkedList.add("Tháng 12");
		System.out.println("Nhập vào chỉ số của phần tử lấy: ");
		int index = sc.nextInt();
		//kiểm tra nếu chỉ số lớn hơn or = 0
		//và nhỏ hơn kích thước của linkedList - 1 thì mới lấy
		//ngược lại thông báo lỗi
		if((index < 0)||(index > (linkedList.size()-1))) {
			System.out.println("Chỉ số cần lấy phải lớn hơn 0 và nhỏ hơn" + (linkedList.size()-1));
		}else {
			//truy cập phần tử có chỉ số index trong linkedList
			//vì linkedList có kiểu là String
			//nên các phần tử con của nó cũng có kieur dữ liệu String
			String node = linkedList.get(index);
			System.out.println("Phần tử có chỉ số = " + index + "trong linkedList là:" + node);
		}
		//truy cập phần tử đầu tiên trong danh sách
		//sử dụng phương thức getFirst()
		String firstNode = linkedList.getFirst();
		//truy cập phần tử cuối cùng trong danh sách
		//sử dụng phương thức getLast()
		String lastNode = linkedList.getLast();
		System.out.println("\n Phần tử đầu tiên trong danh sách là" + firstNode + ";" + "Phần tử cuối cùng trong danh sách là" + lastNode);
	}

}
