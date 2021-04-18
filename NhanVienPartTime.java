package model;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
	private int Giolamviec;
	public NhanVienPartTime(String ten, int Giolamviec) {
		this.ten = ten;
		this.Giolamviec = Giolamviec;
	}
	public String LoaiNhanVien() {
		return "Nhan vien thoi vu";
	}
	public void tinhLuong() {
		luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * Giolamviec;
	}
}
