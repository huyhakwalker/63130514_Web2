package DuAn.NguyenQuocHuy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DuAn.NguyenQuocHuy.models.DonHang;
import DuAn.NguyenQuocHuy.repositories.DonHangRepository;

import java.util.List;

@Service
public class DonHangService {
    @Autowired
    private DonHangRepository donHangRepository;

    public List<DonHang> getAllDonHangs() {
        return donHangRepository.findAll();
    }

    public DonHang getDonHangById(int id) {
        return donHangRepository.findById(id).orElse(null);
    }

    public DonHang saveOrUpdateDonHang(DonHang donHang) {
        return donHangRepository.save(donHang);
    }

    public void deleteDonHang(int id) {
        donHangRepository.deleteById(id);
    }
}