import java.util.LinkedList;
import java.util.List;

public class DanhSachNguoiDung {
	
	private List <NguoiDung> danhSachNguoiDung = new LinkedList<NguoiDung>();
	
	// NguoiDung for test
	{
	NguoiDung nguoiDungTest = new NguoiDung("31", "Ca", "admin");
	danhSachNguoiDung.add(nguoiDungTest);
	}
	
	public NguoiDung timNguoiDung (String id) {
		for (NguoiDung nguoiDung : danhSachNguoiDung) {
			if (nguoiDung.getId().equals(id)) {
				return nguoiDung;
			}
		}
		return null;
	}
	
	public boolean themNguoiDung (NguoiDung nguoiDung) {
		return danhSachNguoiDung.add(nguoiDung);
	}
	
	public void display() {
		for (NguoiDung nguoiDung : danhSachNguoiDung) {
			System.out.println("\nNgười dùng thứ " +danhSachNguoiDung.indexOf(nguoiDung)+ ":");
			System.out.println(nguoiDung.toString());
		}
	}
}
