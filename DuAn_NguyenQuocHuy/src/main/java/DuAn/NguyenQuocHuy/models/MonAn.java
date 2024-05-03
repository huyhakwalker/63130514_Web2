package DuAn.NguyenQuocHuy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "monan")
public class MonAn {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "mamonan")
	private int mamonan;
	
	
	@Column(name = "tenmonan")
	private String tenmonan;
	
	
	@Column(name = "gia")
	private int gia;
	
	@Column(name = "loaimonan")
	private int loaimonan;

	public int getMamonan() {
		return mamonan;
	}

	public void setMamonan(int mamonan) {
		this.mamonan = mamonan;
	}

	public String getTenmonan() {
		return tenmonan;
	}

	public void setTenmonan(String tenmonan) {
		this.tenmonan = tenmonan;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getLoaimonan() {
		return loaimonan;
	}

	public void setLoaimonan(int loaimonan) {
		this.loaimonan = loaimonan;
	}

	
}
