package nguyenthilinhchi.kiemtracanhan.repository;

import nguyenthilinhchi.kiemtracanhan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.username=?1")
    User findByUsername(String username);
}
