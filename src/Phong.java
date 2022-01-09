
public class Phong {
	private int so;
	private String loaiPhong;
	private String kieuPhong;
	private String tinhTrang;
	private double tienCoc;
	
	public final double GIUONG_DON = 10_000_000;
	public final double GIUONG_DOI = 13_000_000;
	public final double TV = 20_000_000;
	public final double NHA_TAM = 5_000_000;
	
	public Phong() {
		
	}
	
	public Phong(int so, String loaiPhong, String kieuPhong, String tinhTrang, double tienCoc) {
		this.so = so;
		this.loaiPhong = loaiPhong;
		this.kieuPhong = kieuPhong;
		this.tinhTrang = tinhTrang;
		this.tienCoc = tienCoc;
	}

	public int getSo() {
		return so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public String getLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public String getKieuPhong() {
		return kieuPhong;
	}

	public void setKieuPhong(String kieuPhong) {
		this.kieuPhong = kieuPhong;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public double getTienCoc() {
		return tienCoc;
	}

	public void setTienCoc(double tienCoc) {
		this.tienCoc = tienCoc;
	}
	
	public String toString() {
		return "Phong " +so+ ":\n"
				+ "\tloaiPhong:  " +loaiPhong+ "\n"
				+ "\tkieuPhong:  " +kieuPhong+ "\n"
				+ "\ttinhTrang:  " +tinhTrang+ "\n"
				+ "\ttienCoc:  " +tienCoc+ "\n";
	}
}
