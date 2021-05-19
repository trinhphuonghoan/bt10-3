package Chuong4;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExp1 {

	public static void main(String[] args) {
		int number;
		TreeSet<Integer> treeSetInteger = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		//thêm các phần tử vào treeSetInteger
		treeSetInteger.add(0);
		treeSetInteger.add(3);
		treeSetInteger.add(1);
		treeSetInteger.add(4);
		treeSetInteger.add(2);
		treeSetInteger.add(8);
		//hiển thị các phần tử trong treeSetInteger
		System.out.println("Các phần tử trong treeSetInteger là:");
		System.out.println(treeSetInteger);
		System.out.println("Nhập phần tử cần thêm:");
		//thêm 1 phần tử mới vào treeSetInteger từ bàn phím
		//nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại
		if(!treeSetInteger.contains(number)) {
			treeSetInteger.add(number);
			System.out.println("Thêm thành công!");
			System.out.println("Các phần tử trong treeSetInteger sau khi thêm là:");
			System.out.println(treeSetInteger);
		}else {
			System.out.println("Phần tử" + number + "đã tồn tại!");
		}
	}

}
