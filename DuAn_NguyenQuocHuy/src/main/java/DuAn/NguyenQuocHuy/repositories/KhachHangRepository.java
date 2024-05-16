package DuAn.NguyenQuocHuy.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DuAn.NguyenQuocHuy.models.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
    List<KhachHang> findByTenKhachHangContaining(String tenKhachHang);
    Page<KhachHang> findByTenKhachHangContaining(String tenKhachHang, Pageable pageable);
}

