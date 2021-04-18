package model;

public class NhanVien {
	protected String ten;
	protected long luong;
	public NhanVien() {
		
	}
	public NhanVien(String ten) {
		this.ten = ten;
	}
	protected String LoaiNhanVien() {
		return "";
	}
	public void xuatThongTin() {
		System.out.println("===== Nhan vien: " + ten + "=====");
		System.out.println("- Loai nhan vien: " + LoaiNhanVien());
		System.out.println("- Luong: " + luong + "VND");
	}
}

