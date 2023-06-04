package nguyenthilinhchi.kiemtracanhan.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import nguyenthilinhchi.kiemtracanhan.entity.User;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user==null)
            return  true;
        return  user.getId()!=null;
    }
}
