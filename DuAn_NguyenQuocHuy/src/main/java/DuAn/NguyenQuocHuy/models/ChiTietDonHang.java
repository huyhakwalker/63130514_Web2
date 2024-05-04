package DuAn.NguyenQuocHuy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chitietdonhang")
public class ChiTietDonHang {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "machitietdonhang")
    private int machitietdonhang;
    
    @ManyToOne
    @JoinColumn(name = "madonhang")
    private DonHang donHang;
    
    @ManyToOne
    @JoinColumn(name = "mamonan")
    private MonAn monAn;
    
    @Column(name = "soluong")
    private int soLuong;

	public int getMaChiTietDonHang() {
		return machitietdonhang;
	}

	public void setMacChiTietDonHang(int machitietdonhang) {
		this.machitietdonhang = machitietdonhang;
	}

	public DonHang getDonHang() {
		return donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}

	public MonAn getMonAn() {
		return monAn;
	}

	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

    
}

