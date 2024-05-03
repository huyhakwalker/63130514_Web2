package DuAn.NguyenQuocHuy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dish {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "MaMonAn")
	private int MaMonAn;
	
	
	@Column(name = "TenMonAn")
	private String TenMonAn;
	
	
	@Column(name = "Gia")
	private int Gia;
	
	@Column(name = "LoaiMonAn")
	private int LoaiMonAn;

	
	
	public Dish(int maMonAn, String tenMonAn, int gia, int loaiMonAn) {
		super();
		MaMonAn = maMonAn;
		TenMonAn = tenMonAn;
		Gia = gia;
		LoaiMonAn = loaiMonAn;
	}
	
	

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getMaMonAn() {
		return MaMonAn;
	}

	public void setMaMonAn(int maMonAn) {
		MaMonAn = maMonAn;
	}

	public String getTenMonAn() {
		return TenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		TenMonAn = tenMonAn;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		Gia = gia;
	}

	public int getLoaiMonAn() {
		return LoaiMonAn;
	}

	public void setLoaiMonAn(int loaiMonAn) {
		LoaiMonAn = loaiMonAn;
	}
	
}
