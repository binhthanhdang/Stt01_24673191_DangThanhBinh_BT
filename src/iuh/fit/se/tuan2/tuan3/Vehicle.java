package iuh.fit.se.tuan2.tuan3;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 2:40:05 PM
 */
public class Vehicle {
	private String tenChu;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	/**
	 * @param tenChu
	 * @param loaiXe
	 * @param dungTich
	 * @param triGia
	 */
	public Vehicle(String tenChu, String loaiXe, int dungTich, double triGia) {
		this.tenChu = tenChu;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}
	
	public Vehicle() {
		this("xxx", "không xác định", 0, 0);
	}
	
	/**
	 * @return the tenChu
	 */
	public String getTenChu() {
		return tenChu;
	}

	/**
	 * @param tenChu the tenChu to set
	 */
	public void setTenChu(String tenChu) {
		this.tenChu = tenChu;
	}

	/**
	 * @return the loaiXe
	 */
	public String getLoaiXe() {
		return loaiXe;
	}

	/**
	 * @param loaiXe the loaiXe to set
	 */
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	/**
	 * @return the dungTich
	 */
	public int getDungTich() {
		return dungTich;
	}

	/**
	 * @param dungTich the dungTich to set
	 */
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	/**
	 * @return the triGia
	 */
	public double getTriGia() {
		return triGia;
	}

	/**
	 * @param triGia the triGia to set
	 */
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double thue() {
		if(dungTich <= 0) return 0;
		if(dungTich < 100) return triGia * 0.01;
		else if(dungTich < 200) return triGia * 0.03;
		else return triGia * 0.05;
	}

	@Override
	public String toString() {
		return String.format("%15s | %15s | %15s | %30.2f | %30.2f", tenChu, loaiXe, dungTich, triGia, thue());
	}
	
	
	
}
