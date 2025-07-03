package com.spring.project.user.validation.validationImpls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.spring.project.user.validation.custom_annotation.PasswordValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class ValidatePassword implements ConstraintValidator<PasswordValidator, String> {

    // Regex for basic complexity (min 1 uppercase, 1 lowercase, 1 digit, 1 special,
    // no whitespace)
    private static final String BASIC_COMPLEXITY_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{10,}$";
    private static final Pattern basicComplexityPattern = Pattern.compile(BASIC_COMPLEXITY_REGEX);

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        // If the password is null or blank, let @NotBlank handle it.
        // Or you can add a check here, but typically you'd layer annotations.
        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        boolean isValid = true;

        // Rule 1: Basic complexity using regex
        Matcher matcher = basicComplexityPattern.matcher(password);
        if (!matcher.matches()) {
            context.buildConstraintViolationWithTemplate(
                    "Password must be at least 10 characters long, contain at least one digit, one lowercase, one uppercase, one special character, and no whitespace.")
                    .addConstraintViolation();
            isValid = false;
        }

        return isValid;
    }
}
