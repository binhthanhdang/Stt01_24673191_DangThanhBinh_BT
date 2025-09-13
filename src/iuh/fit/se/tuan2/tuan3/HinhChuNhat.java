package iuh.fit.se.tuan2.tuan3;


/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 1:17:22 PM
 */
public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	
	/**
	 * @param chieuDai
	 * @param chieuRong
	 */
	public HinhChuNhat(double chieuDai, double chieuRong) {
		if(chieuDai <= 0 || chieuRong <= 0) {
			throw new IllegalArgumentException("chiều dài và chiều rộng phải lớn hon 0");
		}
		setChieuDai(chieuDai);
		setChieuRong(chieuRong);
	}
	
	public HinhChuNhat() {
		this(0.0, 0.0);
	}
	/**
	 * @return the chieuDai
	 */
	public double getChieuDai() {
		return chieuDai;
	}
	/**
	 * @param chieuDai the chieuDai to set
	 */
	public void setChieuDai(double chieuDai) {
		if(chieuDai <= 0) {
			throw new IllegalArgumentException("chiều dài > 0");
		}
		this.chieuDai = chieuDai;
	}
	/**
	 * @return the chieuRong
	 */
	public double getChieuRong() {
		return chieuRong;
	}
	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(double chieuRong) {
		if(chieuRong <= 0) {
			throw new IllegalArgumentException("chiều rộng > 0");
		}
		this.chieuRong = chieuRong;
	}
	
	public double dienTich() {
		return chieuDai * chieuRong;
	}
	
	public double chuVi() {
		return (chieuDai + chieuRong) * 2;
	}
	@Override
	public String toString() {
		return String.format("%10s | %10s | %10s | %10s", chieuDai, chieuRong, dienTich(), chuVi());
	}
	
	
}
