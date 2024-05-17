package DuAn.NguyenQuocHuy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import DuAn.NguyenQuocHuy.models.NhanVien;
import DuAn.NguyenQuocHuy.repositories.NhanVienRepository;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAllNhanViens() {
        return nhanVienRepository.findAll();
    }

    public NhanVien getNhanVienById(int id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    public NhanVien saveOrUpdateNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public void deleteNhanVien(int id) {
        nhanVienRepository.deleteById(id);
    }
    public List<NhanVien> searchByTenNhanVien(String tenNhanVien) {
        return nhanVienRepository.findByTenNhanVienContaining(tenNhanVien);
    }

    public Page<NhanVien> searchByTenNhanVien(String tenNhanVien, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return nhanVienRepository.findByTenNhanVienContaining(tenNhanVien, pageable);
    }
}


