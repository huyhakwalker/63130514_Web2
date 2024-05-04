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
    private int maloaimonan;
    
    @Column(name = "tenloaimonan")
    private String tenloaimonan;

	public int getMaLoaiMonAn() {
		return maloaimonan;
	}

	public void setMaLoaiMonAn(int maloaimonan) {
		this.maloaimonan = maloaimonan;
	}

	public String getTenLoaiMonAn() {
		return tenloaimonan;
	}

	public void setTenLoaiMonAn(String tenloaimonan) {
		this.tenloaimonan = tenloaimonan;
	}

    
}

