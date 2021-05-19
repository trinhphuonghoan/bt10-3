package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {

	public static void main(String[] args) {
		String name;
		HashSet<String> hashSetString = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		//thêm các phần tử vào hashSetString
		hashSetString.add("Wilson");
		hashSetString.add("Nike");
		hashSetString.add("Volve");
		hashSetString.add("Kia");
		hashSetString.add("Lenovo");
		hashSetString.add("Dell");
		//hiển thị các phần tử trong hashSetString 
		System.out.println("Các phần tử trong hashSetString:");
		System.out.println(hashSetString);
		System.out.println("Nhập phần tử cần xóa:");
		name = sc.nextLine();
		//nếu phần tử cần xóa có tồn tại trong hashSetString thì sẽ thông báo xóa thành công
		//và hiển thị các phần tử còn lại ngược lại thông báo xóa khoogn thành công 
		if(hashSetString.contains(name)) {
			hashSetString.remove(name);
			System.out.println("Xóa thành công!");
			System.out.println("Các phần tử còn lại trong hashSetString là:");
			System.out.println(hashSetString);
		}else {
			System.out.println("Xóa không thành công!");
		}
	}

}
