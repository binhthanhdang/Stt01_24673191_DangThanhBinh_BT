package iuh.fit.se.tuan2.tuan3;

import java.util.Calendar;
import java.util.Date;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 3:54:07 PM
 */
public class HangThucPhamTest {

	public static void main(String[] args) {
		Date ngaySX = new Date();
		
        Calendar calender = Calendar.getInstance();
        calender.setTime(ngaySX);
        calender.add(Calendar.YEAR, 3);
        Date ngayHH = calender.getTime();
        
        String tieuDe = String.format("%10s | %20s | %20s | %15s | %15s | %10s", "mã hàng", "tên hàng", "đơn giá"
        		, "ngày sản xuất", "ngày hết hạn", "còn hạn");
        
        HangThucPham htp1 = new HangThucPham("NG001", "Nước Giặc", 98000, ngaySX, ngayHH);
        System.out.println(tieuDe);
        System.out.println(htp1);
	}

}
