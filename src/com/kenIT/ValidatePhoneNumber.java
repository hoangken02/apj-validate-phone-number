package com.kenIT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String REGEX_PHONE_NUMBER = "^([8][4]-)?([0]\\d{9})$";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
