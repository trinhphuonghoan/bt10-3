package model;

import util.Configs;

public class mainClass {
	public static void main(String[] args) {
		//cong ty co 3 nhan vien toan fulltime,1 nhan vien parttime, 1 sep, sep k lam them ngay nao
		NhanVienFullTime sep = new NhanVienFullTime("Trinh Phuong Hoan");
		sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
		NhanVienFullTime nv1 = new NhanVienFullTime("Le Duc Phan Long");//khong lam them ngay nao
		nv1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
		NhanVienFullTime nv2 = new NhanVienFullTime("Nguyen Sy Uoc",3);//Lam them 3 ngay
		nv2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
		NhanVienPartTime nv3 = new NhanVienPartTime("Le Hoai Nam",240);
		//Tinh luong
		sep.tinhLuong();
		nv1.tinhLuong();
		nv2.tinhLuong();
		nv3.tinhLuong();
		//In thong tin
		sep.xuatThongTin();
		nv1.xuatThongTin();
		nv2.xuatThongTin();
		nv3.xuatThongTin();
	}
}
