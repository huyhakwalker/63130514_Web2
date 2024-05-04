package DuAn.NguyenQuocHuy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "donhang")
public class DonHang {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "madonhang")
    private int madonhang;
    
    @ManyToOne
    @JoinColumn(name = "makhachhang")
    private KhachHang makhachhang;
    
    @ManyToOne
    @JoinColumn(name = "manhanvien")
    private NhanVien manhanvien;
    
    @Column(name = "ngaydat")
    private Date ngaydat;
    
    @Column(name = "tongtien")
    private int tongtien;
    
    @Column(name = "tinhtrang")
    private int tinhtrang;

	public int getMaDonHang() {
		return madonhang;
	}

	public void setMaDonHang(int madonhang) {
		this.madonhang = madonhang;
	}

	public KhachHang getKhachHang() {
		return makhachhang;
	}

	public void setKhachHang(KhachHang makhachhang) {
		this.makhachhang = makhachhang;
	}

	public NhanVien getNhanVien() {
		return manhanvien;
	}

	public void setNhanVien(NhanVien manhanvien) {
		this.manhanvien = manhanvien;
	}

	public Date getNgayDat() {
		return ngaydat;
	}

	public void setNgayDat(Date ngaydat) {
		this.ngaydat = ngaydat;
	}

	public int getTongTien() {
		return tongtien;
	}

	public void setTongTien(int tongtien) {
		this.tongtien = tongtien;
	}

	public int getTinhTrang() {
		return tinhtrang;
	}

	public void setTinhTrang(int tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

    
}

