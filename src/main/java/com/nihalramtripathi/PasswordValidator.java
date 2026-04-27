package com.nihalramtripathi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PasswordValidator {

    private final String password;

    public PasswordValidator(String password) {
        this.password = password;
        int a = 108;
        //[8, 0, 200]
        //+= 108;

    }

    /**
     * 1. Condition one password must be minimum of 8 character
     * 2. Password must contain minimum of 1 Upper, 1 Lower , 1 Number , and 1 Symbol
     * Reproduce steps :
     * 1. Without Stream API
     * 2. With Stream API
     *
     * @return
     */
    public boolean validate() {
        boolean isCorrectFormatted = false;
        boolean isDigitContain = false;
        boolean isSymbolContain = false;
        boolean isUpperCharContain = false;
        boolean isLowerCharContain = false;

        char[] passwordArray = password.toCharArray();
        if (passwordArray.length < 8) {
            return isCorrectFormatted;
        }
        for (char c : passwordArray) {
            System.out.println("Char value:" + c);
            if (Character.isDigit(c)) {
                isDigitContain = true;
            }
            if (c == '@' || c == '#' || c == '!') {
                isSymbolContain = true;
            }
            if (Character.isUpperCase(c)) {
                isUpperCharContain = true;
            }
            if (Character.isLowerCase(c)) {
                isLowerCharContain = true;
            }
        }
        if (isDigitContain && isSymbolContain && isUpperCharContain && isLowerCharContain) {
            isCorrectFormatted = true;
        }
        return isCorrectFormatted;
    }

    public boolean validateWithStream() {


        if (password.length() < 8) {
            return false;
        }

        boolean isDigit = password.chars().anyMatch(Character::isDigit);
        boolean isUpperCase = password.chars().anyMatch(Character::isUpperCase);
        boolean isLowerCase = password.chars().anyMatch(Character::isLowerCase);
        boolean isSymbol = password.chars().anyMatch(c -> c == '@' || c == '!' || c == '#');

        return isDigit && isUpperCase && isLowerCase && isSymbol;
    }
}
