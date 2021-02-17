package jiwon.study.springapplicationcontext;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Event.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// title이 empty면 안 된다
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title now allowed.");
	}
}
