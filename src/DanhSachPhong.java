import java.util.LinkedList;
import java.util.List;

public class DanhSachPhong {
	
	private List <Phong> danhSachPhong = new LinkedList<Phong>();
	
	// Phong for test
	{
	Phong phongTest = new Phong(1, "don", "ngao", "trong", 120000);
	danhSachPhong.add(phongTest);
	}
	
	public Phong timPhong (int so) {
		for (Phong phong : danhSachPhong) {
			if (so == phong.getSo()) {
				return phong;
			}
		}
		return null;
	}
	
	public boolean themPhong (Phong phong) {
		return danhSachPhong.add(phong);
	}
	
	public void xoaPhong (Phong phong) {
		danhSachPhong.remove(phong);
	}
	
	public void display() {
		for (Phong phong : danhSachPhong) {
			System.out.println(phong.toString());
		}
	}
}
