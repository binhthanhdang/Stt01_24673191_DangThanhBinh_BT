package iuh.fit.se.tuan2.tuan3;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 5:39:44 PM
 */
public class AccountList {
	private Account[] accList;
	private int count;

	public AccountList() {
		accList = new Account[10];
		count = 0;
	}

	public AccountList(int n) {
		if (n > 0)
			accList = new Account[n];
		else
			accList = new Account[10];
		count = 0;
	}

	public int size() {
		return count;
	}

	public boolean add(Account acc) {
		if (acc == null)
			return false;
		if (count >= accList.length)
			return false;
		if (findByNumber(acc.getSoTaiKhoan()) != null)
			return false;
		accList[count++] = acc;
		return true;
	}

	public Account findByNumber(long soTaiKhoan) {
		for (int i = 0; i < count; i++) {
			if (accList[i].getSoTaiKhoan() == soTaiKhoan)
				return accList[i];
		}
		return null;
	}

	public boolean removeByNumber(long soTaiKhoan) {
		for (int i = 0; i < count; i++) {
			if (accList[i].getSoTaiKhoan() == soTaiKhoan) {
				for (int j = i; j < count - 1; j++)
					accList[j] = accList[j + 1];
				accList[count - 1] = null;
				count--;
				return true;
			}
		}
		return false;
	}

	public void printAll() {
		System.out.printf("%-12s %-20s %15s %-30s\n", "SoTK", "TenTK", "SoTien", "TrangThai");
		for (Account acc : accList) {
	        if (acc != null) {
	            System.out.println(acc);
	        }
	    }
	}
}
