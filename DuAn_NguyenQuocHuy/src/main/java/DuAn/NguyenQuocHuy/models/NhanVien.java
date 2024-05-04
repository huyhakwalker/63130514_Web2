package DuAn.NguyenQuocHuy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manhanvien")
    private int manhanvien;
    
    @Column(name = "tennhanvien")
    private String tennhanvien;
    
    @Column(name = "sodienthoai")
    private String sodienthoai;
    
    @Column(name = "luong")
    private String luong;

	public int getMaNhanVien() {
		return manhanvien;
	}

	public void setMaNhanVien(int manhanvien) {
		this.manhanvien = manhanvien;
	}

	public String getTenNhanVien() {
		return tennhanvien;
	}

	public void setTenNhanVien(String tennhanvien) {
		this.tennhanvien = tennhanvien;
	}

	public String getSoDienThoai() {
		return sodienthoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getLuong() {
		return luong;
	}

	public void setLuong(String luong) {
		this.luong = luong;
	}

    
}

