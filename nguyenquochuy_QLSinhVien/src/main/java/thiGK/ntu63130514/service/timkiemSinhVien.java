package thiGK.ntu63130514.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu63130514.models.SinhVien;

@Service
public class timkiemSinhVien {
	@Autowired
    private SinhVienService dsSinhVien;

    // Tìm kiếm thông tin sản phẩm theo mã
    public SinhVien searchSinhVienById(String maSinhVien) {
        return dsSinhVien.findSinhVienById(maSinhVien);
    }
}
