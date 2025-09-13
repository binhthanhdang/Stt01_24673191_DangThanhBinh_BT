package iuh.fit.se.tuan2.tuan3;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 1:41:30 PM
 */
public class Sinhvien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	/**
	 * @param maSV
	 * @param hoTen
	 * @param lT
	 * @param tH
	 */
	public Sinhvien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	
	public Sinhvien() {
		this(0, "", 0, 0);
	}

	/**
	 * @return the maSV
	 */
	public int getMaSV() {
		return maSV;
	}

	/**
	 * @param maSV the maSV to set
	 */
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the diemLT
	 */
	public float getDiemLT() {
		return diemLT;
	}

	/**
	 * @param diemLT the diemLT to set
	 */
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	/**
	 * @return the diemTH
	 */
	public float getDiemTH() {
		return diemTH;
	}

	/**
	 * @param diemTH the diemTH to set
	 */
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	
	public float tinhDTB() {
		return (diemLT + diemTH) / 2;
	}

	@Override
	public String toString() {
		return String.format("%15s | %20s | %20s | %20s | %10s", maSV, hoTen, diemLT, diemTH, tinhDTB());
	}
	
	
	
}
