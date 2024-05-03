package DuAn.NguyenQuocHuy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DuAn.NguyenQuocHuy.models.LoaiMonAn;
import DuAn.NguyenQuocHuy.repositories.LoaiMonAnRepository;

import java.util.List;

@Service
public class LoaiMonAnService {
    @Autowired
    private LoaiMonAnRepository loaiMonAnRepository;

    public List<LoaiMonAn> getAllLoaiMonAns() {
        return loaiMonAnRepository.findAll();
    }

    public LoaiMonAn getLoaiMonAnById(int id) {
        return loaiMonAnRepository.findById(id).orElse(null);
    }

    public LoaiMonAn saveOrUpdateLoaiMonAn(LoaiMonAn loaiMonAn) {
        return loaiMonAnRepository.save(loaiMonAn);
    }

    public void deleteLoaiMonAn(int id) {
        loaiMonAnRepository.deleteById(id);
    }
}

