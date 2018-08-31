package com.sangram.custannotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=MyEmailValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface IsValidEmail {

	String domain() default "@gmail.com";
	String message() default "Provide valid email id with valid domain name";
	
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};
	
}
