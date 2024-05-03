package DuAn.NguyenQuocHuy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DuAn.NguyenQuocHuy.models.MonAn;
import DuAn.NguyenQuocHuy.repositories.MonAnRepository;

import java.util.List;

@Service
public class MonAnService {
    @Autowired
    private MonAnRepository monAnRepository;

    public List<MonAn> getAllMonAns() {
        return monAnRepository.findAll();
    }

    public MonAn getMonAnById(int id) {
        return monAnRepository.findById(id).orElse(null);
    }

    public MonAn saveOrUpdateMonAn(MonAn monAn) {
        return monAnRepository.save(monAn);
    }

    public void deleteMonAn(int id) {
        monAnRepository.deleteById(id);
    }
}
