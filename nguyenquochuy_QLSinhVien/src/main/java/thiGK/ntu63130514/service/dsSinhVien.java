package thiGK.ntu63130514.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu63130514.models.SinhVien;

import java.util.List;

@Service
public class dsSinhVien {
	@Autowired
    private SinhVienService sinhVienService;

    public List<SinhVien> getAllData() {
        return sinhVienService.getAllSinhvien();
    }
}
