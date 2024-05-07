package DuAn.NguyenQuocHuy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loaimonan")
public class LoaiMonAn {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maloaimonan")
    private int maLoaiMonAn;
    
    @Column(name = "tenloaimonan")
    private String tenLoaiMonAn;

	public int getMaLoaiMonAn() {
		return maLoaiMonAn;
	}

	public void setMaLoaiMonAn(int maLoaiMonAn) {
		this.maLoaiMonAn = maLoaiMonAn;
	}

	public String getTenLoaiMonAn() {
		return tenLoaiMonAn;
	}

	public void setTenLoaiMonAn(String tenLoaiMonAn) {
		this.tenLoaiMonAn = tenLoaiMonAn;
	}
    
    
}


