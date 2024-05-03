package DuAn.NguyenQuocHuy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DuAn.NguyenQuocHuy.models.LoaiMonAn;

@Repository
public interface LoaiMonAnRepository extends JpaRepository<LoaiMonAn, Integer> {
}


