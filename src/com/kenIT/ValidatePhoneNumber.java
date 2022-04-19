package com.kenIT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String REGEX_PHONE_NUMBER = "([(]\\d{2}[)])[-]([(]\\d{10}[)])";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
