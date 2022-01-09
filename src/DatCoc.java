import java.time.LocalDate;
import java.util.Date;

public class DatCoc {
	private int so;
	private String id;
	private LocalDate ngayNhanPhong;
	private int ngayThuePhong;
	private boolean daDat;
	private Date ngayTraPhong;
	
	public DatCoc () {
		
	}

	public DatCoc(int so, String id, LocalDate ngayNhanPhong, int ngayThuePhong, boolean daDat) {
		this.so = so;
		this.id = id;
		this.ngayNhanPhong = ngayNhanPhong;
		this.ngayThuePhong = ngayThuePhong;
		this.daDat = daDat;
		
		//c.defaultTimeZone(ngayNhanPhong);
		//c.add(Calendar.DAY_OF_MONTH, ngayThuePhong);
		//ngayTraPhong = c.getTime();
	}

	public int getSo() {
		return so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getNgayNhanPhong() {
		return ngayNhanPhong;
	}

	public void setNgayNhanPhong(LocalDate ngayNhanPhong2) {
		this.ngayNhanPhong = ngayNhanPhong2;
	}

	public int getNgayThuePhong() {
		return ngayThuePhong;
	}

	public void setNgayThuePhong(int ngayThuePhong) {
		this.ngayThuePhong = ngayThuePhong;
	}

	public boolean isDaDat() {
		return daDat;
	}

	public void setDaDat(boolean daDat) {
		this.daDat = daDat;
	}

	public Date getNgayTraPhong() {
		return ngayTraPhong;
	}

	public void setNgayTraPhong(Date ngayTraPhong) {
		this.ngayTraPhong = ngayTraPhong;
	}
	
	public String toString () {
		return "Số phòng: " +so+
				"\nSố CMND/CCCD/hộ chiếu: " +id+
				"\nNgày nhận phòng: " +ngayNhanPhong+
				"\nSố ngày thuê phòng: " +ngayThuePhong+ "\n";
	}

}
