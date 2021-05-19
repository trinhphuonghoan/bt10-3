package Chuong4;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//khai báo 1 ArrayList có tên là arrListInterger
		//có kiểu là Interger
		ArrayList<Integer> arrListInteger = new ArrayList<>();
		//thêm các phần tử sử dụng phương thức add()
		arrListInteger.add(0);
		arrListInteger.add(7);
		arrListInteger.add(1);
		arrListInteger.add(9);
		//duyệt theo kích thước của arrListInteger
		//sử dụng còng lặp for duyệt theo đối tượng
		//trong đó kiểu dữ liệu của biến number
		//phải trùng với kiểu dữ liệu của arrListinteger
		System.out.println("Các phần tử có trong arrListInteger là:");
		for(int number : arrListInteger ) {
			System.out.print(number + "\t");
		}

	}

}
