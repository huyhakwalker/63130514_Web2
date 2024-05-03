package DuAn.NguyenQuocHuy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DuAn.NguyenQuocHuy.models.DonHang;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
}

