package iuh.fit.se.tuan2.tuan3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 3:26:25 PM
 */
public class HangThucPham {
	private final String maHang;
	private String tenHang;
	private double donGia;
	private Date ngaySanXuat;
	private Date ngayHetHan;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static DecimalFormat df = new DecimalFormat("#,###.00 VND");
	
	public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
		this.maHang = (maHang != null && !maHang.trim().isEmpty()) ? maHang : "không tồn tại";
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public HangThucPham(String maHang) {
		this.maHang = (maHang != null && !maHang.trim().isEmpty()) ? maHang : "không tồn tại";
		this.tenHang = "không tồn tại";
		this.donGia = 0;
		this.ngaySanXuat = new Date();
		this.ngayHetHan = new Date();
	}

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}
	
	public void setTenHang(String tenHang) {
		if (tenHang == null || tenHang.trim().isEmpty())
			tenHang = "không tồn tại";
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}
	
	public void setDonGia(double donGia) {
		if (donGia < 0)
			donGia = 0;
		this.donGia = donGia;
	}

	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	
	public void setNgaySanXuat(Date ngaySanXuat) {
		if (ngaySanXuat == null)
			ngaySanXuat = new Date();
		this.ngaySanXuat = ngaySanXuat;
	}

	public Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		if (ngayHetHan != null && ngaySanXuat != null && ngayHetHan.after(ngaySanXuat)) {
			this.ngayHetHan = ngayHetHan;
		} else {
			this.ngayHetHan = new Date();
		}
	}

	public boolean daHetHan() {
		Date today = new Date();
		return ngayHetHan.before(today);
	}
	
	@Override
	public String toString() {
	    return String.format("%10s | %20s | %20s | %15s | %15s | %10s", maHang, tenHang,
	    		df.format(donGia), sdf.format(ngaySanXuat), sdf.format(ngayHetHan), daHetHan() ? "hết" : "còn");
	}

}