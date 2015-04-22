package edu.spring.mvc.customValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	private String validHobbies;
	public void initialize(IsValidHobby hobby) {
		this.validHobbies = hobby.hobbies();		
	}

	public boolean isValid(String hobby, ConstraintValidatorContext context) {
		if(hobby == null){
			return false;
		}
		if(hobby.matches(validHobbies)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
