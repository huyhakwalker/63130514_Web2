package DuAn.NguyenQuocHuy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import DuAn.NguyenQuocHuy.models.KhachHang;
import DuAn.NguyenQuocHuy.repositories.KhachHangRepository;
import java.util.List;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    public List<KhachHang> getAllKhachHangs() {
        return khachHangRepository.findAll();
    }

    public KhachHang getKhachHangById(int id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    public KhachHang saveOrUpdateKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    public void deleteKhachHang(int id) {
        khachHangRepository.deleteById(id);
    }
    public List<KhachHang> searchByTenKhachHang(String tenKhachHang) {
        return khachHangRepository.findByTenKhachHangContaining(tenKhachHang);
    }
    
    public Page<KhachHang> searchByTenKhachHang(String tenKhachHang, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return khachHangRepository.findByTenKhachHangContaining(tenKhachHang, pageable);
    }
}
