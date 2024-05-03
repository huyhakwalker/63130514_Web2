package DuAn.NguyenQuocHuy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DuAn.NguyenQuocHuy.models.MonAn;

@Repository
public interface MonAnRepository extends JpaRepository<MonAn, Integer> {
}

