package com.github.perscholas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * Created by leon on 8/31/2020.
 */
public class EmailValidator
        implements ConstraintValidator<EmailConstraint, String> {

    public static boolean validate(String emailToBeValidated) {
        Pattern emailValidationPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        return emailValidationPattern.matcher(emailToBeValidated).find();
    }

    @Override
    public void initialize(EmailConstraint emailContraint) {
        // TODO - write stuff here
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return validate(email) && email.length() > 8 && email.length() < 14;
    }
}
