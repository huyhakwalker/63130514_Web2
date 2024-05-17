package DuAn.NguyenQuocHuy.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DuAn.NguyenQuocHuy.models.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
	List<NhanVien> findByTenNhanVienContaining(String tenNhanVien);
	Page<NhanVien> findByTenNhanVienContaining(String tenNhanVien, Pageable pageable);
}


