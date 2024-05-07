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
@Table(name = "monan")
public class MonAn {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "mamonan")
	private int maMonAn;
	
	
	@Column(name = "tenmonan")
	private String tenMonAn;
	
	
	@Column(name = "gia")
	private int gia;
	
	@ManyToOne
    @JoinColumn(name = "loaimonan")
    private LoaiMonAn loaiMonAn;

	public int getMaMonAn() {
		return maMonAn;
	}

	public void setMaMonAn(int maMonAn) {
		this.maMonAn = maMonAn;
	}

	public String getTenMonAn() {
		return tenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		this.tenMonAn = tenMonAn;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public LoaiMonAn getLoaiMonAn() {
		return loaiMonAn;
	}

	public void setLoaiMonAn(LoaiMonAn loaiMonAn) {
		this.loaiMonAn = loaiMonAn;
	}

}
