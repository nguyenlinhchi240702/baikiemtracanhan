package nguyenthilinhchi.kiemtracanhan.service;

import nguyenthilinhchi.kiemtracanhan.entity.User;
import nguyenthilinhchi.kiemtracanhan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void  save(User user){
        userRepository.save(user);
    }
}
