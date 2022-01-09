import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DanhSachDatCoc {
	
	private List <DatCoc> danhSachDatCoc = new LinkedList<DatCoc>();
	
	// NguoiDung for test
	{
		String date = "2022-02-22";
		LocalDate nhanPhong = LocalDate.parse(date);
		DatCoc datCocTest = new DatCoc(1, "31", nhanPhong, 8, true);
		danhSachDatCoc.add(datCocTest);
	}
	
	public DatCoc timDatCoc (int so) {
		for (DatCoc datCoc : danhSachDatCoc) {
			if (datCoc.getSo() == so) {
				return datCoc;
			}
		}
		return null;
	}
	
	public boolean themDatCoc (DatCoc datCoc) {
		return danhSachDatCoc.add(datCoc);
	}
}
