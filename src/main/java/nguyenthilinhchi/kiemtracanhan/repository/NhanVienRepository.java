package nguyenthilinhchi.kiemtracanhan.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import nguyenthilinhchi.kiemtracanhan.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
}
