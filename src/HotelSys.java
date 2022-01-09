import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class HotelSys {
	
	public static DanhSachPhong danhSachPhong = new DanhSachPhong();
	public static DanhSachNguoiDung danhSachNguoiDung = new DanhSachNguoiDung();
	public static DanhSachDatCoc danhSachDatCoc = new DanhSachDatCoc();
	
	public static Scanner input = new Scanner(System.in);
    public static LocalDate now = LocalDate.now();
    public static NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
	
	public static void themNguoiDung() {
		NguoiDung nguoiDung = new NguoiDung();
		
		while (true) {
			System.out.print("Nhập số CMND/CCCD/hộ chiếu: ");
			nguoiDung.setId(input.next());
			input.nextLine();
			System.out.print("Nhập tên: ");
			nguoiDung.setTen(input.nextLine());
			System.out.print("Nhập loại: ");
			nguoiDung.setLoai(input.next());
			if (danhSachNguoiDung.themNguoiDung (nguoiDung)) {
				System.out.println("Thêm người dùng thành công\n");
				System.out.println(nguoiDung.toString() +"\n");
				break;
			} else {
				System.out.println("Không thể thêm người dùng!");
				break;
			}
		}
		
	}
	
	public static void themPhong() {
		
		Phong phong = new Phong();
		while (true) {
			System.out.print("Nhập số phòng: ");
			phong.setSo(input.nextInt());
			System.out.print("Nhập loại phòng: ");
			phong.setLoaiPhong(input.next());
			System.out.print("Nhập kiểu phòng: ");
			phong.setKieuPhong(input.next());
			System.out.print("Nhập tình trạng: ");
			phong.setTinhTrang(input.next());
			System.out.print("Nhập tiền cọc: ");
			phong.setTienCoc(input.nextDouble());
			if (danhSachPhong.themPhong(phong)) {
				System.out.println("Thêm phòng thành công");
				System.out.println(phong.toString());
				break;
			} else {
				System.out.println("Không thể thêm phòng!");
				break;
			}
		}
	}
	
	public static void xoaPhong() {
		
		Phong temp;
		int so;
		while (true) {
			System.out.print("Nhập số phòng: ");
			so = input.nextInt();
			if (danhSachPhong.timPhong(so) != null) {
				temp = danhSachPhong.timPhong(so);
				danhSachPhong.xoaPhong(temp);
				System.out.println("Xóa phòng thành công.");
				break;
			} else {
				System.out.println("Không tìm thấy phòng");
				System.out.println("Vui lòng nhập lại");
			}
		}
	}
	
	public static void datPhong() {
		
		DatCoc datCoc = new DatCoc();
		while (true) {
			System.out.print ("Nhập số phòng muốn đặt: ");
			datCoc.setSo(input.nextInt());
			if (danhSachPhong.timPhong(datCoc.getSo()) != null) {
				break;
			} else {
				System.out.println("Phòng không tồn tại!");
			}
		}
		
		while (true) {
			System.out.print("Nhập số CMND/CCCD/hộ chiếu: ");
			datCoc.setId(input.next());
			input.nextLine();
			if (danhSachNguoiDung.timNguoiDung(datCoc.getId()) != null) {
				break;
			} else {
				System.out.println("Người dùng không tồn tại!");
			}
		}
		
		String date;
		LocalDate ngayNhanPhong;
		
		while (true) {
			System.out.print("Nhập ngày nhận phòng (yyyy-mm-dd): ");
			date = input.nextLine();
			ngayNhanPhong = LocalDate.parse(date);
			
			if (ngayNhanPhong.compareTo(now) < 0 ) {
				System.out.println("Ngày nhận phòng không hợp lệ (trước ngày hôm nay)");
				continue;
			} else {
				datCoc.setNgayNhanPhong(ngayNhanPhong);
				break;
			}
		}
		
		System.out.print("Nhập số ngày thuê: ");
		datCoc.setNgayThuePhong(input.nextInt());
		
		danhSachDatCoc.themDatCoc (datCoc);
		System.out.print("Đặt phòng thành công!");
		System.out.println(datCoc.toString());
	}
	
	private static void huyDat() {
		
	}
	
	private static void nhanPhong() {
		
	}
	
	private static void traPhong() {
		int so;
		int chon = 0;
		double boiThuong = 0;
		DatCoc datCoc;
		Phong phong = null;
		
		while (true) {
			System.out.print("Nhập số phòng: ");
			so = Integer.parseInt(input.next());
			datCoc = danhSachDatCoc.timDatCoc(so);
			if (datCoc != null) {
				phong = danhSachPhong.timPhong(so);
				do {
					System.out.println("\nTài sản hư hại: ");
					System.out.println("1. TV");
					System.out.println("2. Giường");
					System.out.println("3. Nhà tắm");
					System.out.println("4. Xem tiền bồi thường");
					System.out.println("5. Tiếp tục");
					chon = Integer.parseInt(input.next());
					switch (chon) {
					case 1:
						boiThuong = boiThuong + phong.TV;
						break;
					case 2: {
						int chonGiuong = 0;
						System.out.println("1. Giường đơn");
						System.out.println("2. Giường đôi");
						chon = Integer.parseInt(input.next());
						if (chonGiuong == 1) {
							boiThuong = boiThuong + phong.GIUONG_DOI;
						} else {
							boiThuong = boiThuong + phong.GIUONG_DON;
						}
					}
						break;
					case 3:
						boiThuong = boiThuong + phong.NHA_TAM;
						break;
					case 4:
						System.out.println("\nTiền bồi thường: " + moneyFormat.format(boiThuong) + "\n");
						break;
					case 5:
						break;
					}
				} while (chon != 5);
				
				break;
				
			} else {
				System.out.println("Số phòng không hợp lệ");
				System.out.println("Vui lòng nhập lại. \n");
			}
		}
		
		phong.setTinhTrang("trong");
		
		System.out.println("\nTổng tiền thuê " +moneyFormat.format(phong.getTienCoc() + boiThuong)+ "\n");
	}
	public static void main(String[] args) {

		int chon = 0;
		while (chon != 9) {
			System.out.println("Hệ thống quản lý khách sạn");
			System.out.println("1. Thêm người dùng");
			System.out.println("2. Xem phòng");
			System.out.println("3. Thêm phòng");
			System.out.println("4. Xóa phòng");
			System.out.println("5. Đặt phòng");
			System.out.println("6. Hủy đặt phòng");
			System.out.println("7. Nhận phòng");
			System.out.println("8. Trả phòng");
			System.out.println("9. Thoát");
			chon = Integer.parseInt(input.next());
			switch (chon) {
				case 1:
					themNguoiDung();
					break;
				case 2:
					danhSachPhong.display();
					break;
				case 3: 
					themPhong();
					break;
				case 4:
					xoaPhong();
					break;
				case 5:
					datPhong();
					break;
				case 6:
					huyDat();
					break;
				case 7:
					nhanPhong();
					break;
				case 8:
					traPhong();
					break;
				case 9: 
					System.out.println("Hệ thống thoát");
					break;
			}
		}
	}

}
