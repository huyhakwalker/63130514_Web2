package thiGK.ntu63130514.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu63130514.models.SinhVien;

@Service
public class themSinhVien {
	@Autowired
    private SinhVienService sinhVienService;

    public void themSinhVienMoi(SinhVien sv) {
    	sinhVienService.themSinhVien(sv);
    }
}
