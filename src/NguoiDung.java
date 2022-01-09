
public class NguoiDung {
	private String id;
	private String ten;
	private String loai;
	
	public NguoiDung() {
		
	}
	
	public NguoiDung(String id, String ten, String loai) {
		super();
		this.id = id;
		this.ten = ten;
		this.loai = loai;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}
	
	public String toString () {
		return "CMND/CCCD/hộ chiếu: " +id+ 
				"\nTên: " +ten+
				"\nLoại: " +loai;
	}
}
