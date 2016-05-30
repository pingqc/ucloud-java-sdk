package jsr303;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class TestValidator {

	public static void main(String[] args) {
		
		User u = new User();
		String[] hobbies = new String[]{"asdf", "dsffffffffffss"};
		u.setHobbies(hobbies);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<User>> violations = validator.validate(u);
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for(ConstraintViolation<User> item: violations) {
			flag = true;
			System.out.println(item.getMessage());
		}
	}
	
}
