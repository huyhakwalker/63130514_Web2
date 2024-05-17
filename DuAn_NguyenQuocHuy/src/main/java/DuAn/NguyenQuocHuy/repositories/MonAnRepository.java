package DuAn.NguyenQuocHuy.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DuAn.NguyenQuocHuy.models.MonAn;

@Repository
public interface MonAnRepository extends JpaRepository<MonAn, Integer> {
	List<MonAn> findByTenMonAnContaining(String tenMonAn);
    Page<MonAn> findByTenMonAnContaining(String tenMonAn, Pageable pageable);
}

