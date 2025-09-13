package iuh.fit.se.tuan2.tuan3;

import java.text.NumberFormat;
import java.util.Locale;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 4:53:27 PM
 */
public class Account {
	private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien;
    private String trangThai;
    
    public static final double INTEREST_RATE = 0.035;
    
    public static final long DEFAULT_SOTK = 999999L;
    public static final String DEFAULT_TEN = "chưa xác định";
    public static final double DEFAULT_SOTIEN = 50.0;
	
    
	public Account() {
		this.soTaiKhoan = DEFAULT_SOTK;
        this.tenTaiKhoan = DEFAULT_TEN;
        this.soTien = DEFAULT_SOTIEN;
        this.trangThai = "";
	}


	/**
	 * @param soTaiKhoan
	 * @param tenTaiKhoan
	 * @param soTien
	 */
	public Account(long soTaiKhoan, String tenTaiKhoan, double soTien) {
        this.trangThai = "";
        setSoTaiKhoan(soTaiKhoan);
        setTenTaiKhoan(tenTaiKhoan);
        setSoTien(soTien);
    }

	
	/**
	 * @param soTaiKhoan
	 * @param tenTaiKhoan
	 */
	public Account(long soTaiKhoan, String tenTaiKhoan) {
		this.trangThai = "";
        setSoTaiKhoan(soTaiKhoan);
        setTenTaiKhoan(tenTaiKhoan);
        this.soTien = DEFAULT_SOTIEN;
	}


	/**
	 * @return the soTaiKhoan
	 */
	public long getSoTaiKhoan() {
		return soTaiKhoan;
	}


	/**
	 * @param soTaiKhoan the soTaiKhoan to set
	 */
	public void setSoTaiKhoan(long soTaiKhoan) {
		if (soTaiKhoan <= 0 || soTaiKhoan == DEFAULT_SOTK) {
            this.soTaiKhoan = DEFAULT_SOTK;
            this.trangThai = "số tài khoản không hợp lệ";
        }
		this.soTaiKhoan = soTaiKhoan;
	}


	/**
	 * @return the tenTaiKhoan
	 */
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}


	/**
	 * @param tenTaiKhoan the tenTaiKhoan to set
	 */
	public void setTenTaiKhoan(String tenTaiKhoan) {
		if(tenTaiKhoan == null || tenTaiKhoan.trim().isEmpty()) {
            this.tenTaiKhoan = DEFAULT_TEN;
            this.trangThai = "tên tài khoản không hợp lệ";
        } 
		this.tenTaiKhoan = tenTaiKhoan;
	}


	/**
	 * @return the soTien
	 */
	public double getSoTien() {
		return soTien;
	}


	/**
	 * @param soTien the soTien to set
	 */
	public void setSoTien(double soTien) {
		if (soTien < DEFAULT_SOTIEN) {
            this.soTien = DEFAULT_SOTIEN;
            this.trangThai = "số tiền không hợp lệ";
        } 
		this.soTien = soTien;
	}


	/**
	 * @return the trangThai
	 */
	public String getTrangThai() {
		return trangThai;
	}
    
	public boolean napTien(double amount) {
        if (amount > 0) {
            soTien += amount;
            trangThai = "Nạp tiền thành công: " + formatMoney(amount);
            return true;
        } else {
            trangThai = "Số tiền nạp không hợp lệ";
            return false;
        }
    }
    
	public boolean rutTien(double amount) {
        if (amount <= 0) {
            trangThai = "Số tiền rút không hợp lệ";
            return false;
        }
        if (amount > soTien) {
            trangThai = "Số dư không đủ để rút";
            return false;
        }
        soTien -= amount;
        trangThai = "Rút tiền thành công: " + formatMoney(amount);
        return true;
    }
	
	public boolean chuyenTien(Account toAccount, double amount) {
        if (toAccount == null) {
            trangThai = "Tài khoản nhận không hợp lệ";
            return false;
        }
        if (amount <= 0) {
            trangThai = "Số tiền chuyển không hợp lệ";
            return false;
        }
        if (amount > soTien) {
            trangThai = "Số dư không đủ để chuyển";
            return false;
        }
        this.soTien -= amount;
        toAccount.soTien += amount;
        this.trangThai = "Chuyển thành công " + formatMoney(amount) + " sang tài khoản " + toAccount.soTaiKhoan;
        return true;
    }
	
	public void daoHan() {
        double interest = soTien * INTEREST_RATE;
        soTien += interest;
        trangThai = "Đáo hạn: cộng lãi " + formatMoney(interest);
    }

    private String formatMoney(double money) {
        Locale local = Locale.forLanguageTag("vi-VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        return formatter.format(money);
    }
    
    @Override
    public String toString() {
        Locale local = Locale.forLanguageTag("vi-VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        return String.format("%-12d %-20s %15s %-30s",
                soTaiKhoan,
                tenTaiKhoan,
                formatter.format(soTien),
                (trangThai == null ? "" : trangThai));
    }
}
