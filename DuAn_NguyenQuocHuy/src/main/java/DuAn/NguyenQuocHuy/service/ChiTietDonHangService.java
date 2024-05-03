package DuAn.NguyenQuocHuy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DuAn.NguyenQuocHuy.models.ChiTietDonHang;
import DuAn.NguyenQuocHuy.repositories.ChiTietDonHangRepository;

import java.util.List;

@Service
public class ChiTietDonHangService {
    @Autowired
    private ChiTietDonHangRepository chiTietDonHangRepository;

    public List<ChiTietDonHang> getAllChiTietDonHangs() {
        return chiTietDonHangRepository.findAll();
    }

    public ChiTietDonHang getChiTietDonHangById(int id) {
        return chiTietDonHangRepository.findById(id).orElse(null);
    }

    public ChiTietDonHang saveOrUpdateChiTietDonHang(ChiTietDonHang chiTietDonHang) {
        return chiTietDonHangRepository.save(chiTietDonHang);
    }

    public void deleteChiTietDonHang(int id) {
        chiTietDonHangRepository.deleteById(id);
    }
}

