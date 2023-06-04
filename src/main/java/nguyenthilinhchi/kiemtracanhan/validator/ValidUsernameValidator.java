package nguyenthilinhchi.kiemtracanhan.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import nguyenthilinhchi.kiemtracanhan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername,String> {
    @Autowired
    private UserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if(userRepository==null)
            return true;
        return userRepository.findByUsername(username)==null;
    }
}
