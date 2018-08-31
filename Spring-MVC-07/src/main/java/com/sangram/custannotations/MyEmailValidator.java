package com.sangram.custannotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyEmailValidator implements ConstraintValidator<IsValidEmail, String>{

	String domain;
	@Override
	public void initialize(IsValidEmail isvalidemail) {
		this.domain=isvalidemail.domain();
	}
	@Override
	public boolean isValid(String uemail, ConstraintValidatorContext context) {

		if(uemail==null)
		{
			return false;
		}
		if(uemail.contains(domain))
		{
			return true;
		}else {
			return false;
		}
	}

}
