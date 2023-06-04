package nguyenthilinhchi.kiemtracanhan.repository;

import nguyenthilinhchi.kiemtracanhan.entity.NhanVien;
import nguyenthilinhchi.kiemtracanhan.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan,String> {
}
