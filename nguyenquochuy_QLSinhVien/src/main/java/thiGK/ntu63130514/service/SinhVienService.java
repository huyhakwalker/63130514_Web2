package thiGK.ntu63130514.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import thiGK.ntu63130514.models.SinhVien;

@Service

public class SinhVienService {
	private List<SinhVien> dsSinhVien = new ArrayList<>();
	
	public SinhVienService() {
		dsSinhVien.add(new SinhVien("63130514", "Sinh viên 1"));
		dsSinhVien.add(new SinhVien("63130514", "Sinh viên 1"));
		dsSinhVien.add(new SinhVien("63130514", "Sinh viên 1"));
    }

    public List<SinhVien> getAllSinhvien() {
        return dsSinhVien;
    }

    public SinhVien findSinhVienById(String maSinhVien) {
        for (SinhVien sv : dsSinhVien) {
            if (sv.getMaSoSV().equals(maSinhVien)) {
                return sv;
            }
        }
        return null;
    }

    public void themSinhVien(SinhVien sinhvien) {
    	dsSinhVien.add(sinhvien);
    }
}
