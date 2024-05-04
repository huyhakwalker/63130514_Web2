package DuAn.NguyenQuocHuy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "khachhang")
public class KhachHang {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makhachhang")
    private int makhachhang;
    
    @Column(name = "tenkhachhang")
    private String tenkhachhang;
    
    @Column(name = "sodienthoai")
    private String sodienthoai;
    
    @Column(name = "diachi")
    private String diachi;

	public int getmakhachhang() {
		return makhachhang;
	}

	public void setmakhachhang(int makhachhang) {
		this.makhachhang = makhachhang;
	}

	public String gettenkhachhang() {
		return tenkhachhang;
	}

	public void settenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}

	public String getsodienthoai() {
		return sodienthoai;
	}

	public void setsodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getdiachi() {
		return diachi;
	}

	public void setdiachi(String diachi) {
		this.diachi = diachi;
	}

}

