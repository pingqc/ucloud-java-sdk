package jsr303;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ArrayItemLenValidator implements ConstraintValidator<ArrayItemLen, String[]>{

	ArrayItemLen constraintAnnotation;
	
	@Override
	public void initialize(ArrayItemLen constraintAnnotation) {
		this.constraintAnnotation = constraintAnnotation;
	}

	@Override
	public boolean isValid(String[] arr, ConstraintValidatorContext context) {
		//自定义的校验逻辑,校验通过返回true，否则返回false
		if(arr == null || arr.length == 0) {
			return true;
		}
		for(String str: arr) {
			if(str == null || 
				str.length() > constraintAnnotation.max() ||
				str.length() < constraintAnnotation.min()) {
				
				return false;
			}
		}
		return true;
	}

}
