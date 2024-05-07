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

    public List<ChiTietDonHang> getChiTietDonHangByMaDonHang(int maDonHang) {
        return chiTietDonHangRepository.findByDonHang_MaDonHang(maDonHang);
    }
}
