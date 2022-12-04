package com.lab1.utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratePasswordUtilTest {


    /**
     * tests
     */
    @Test
    public void whenPasswordGeneratedUsingCommonsLang3_thenSuccessful() {
        GeneratePasswordUtil generatePasswordUtil = new GeneratePasswordUtil();
        String password = generatePasswordUtil.generateRandomPassword();
        int numCount = 0;
        for(char c: password.toCharArray()) {
            if(c >= 48 || c <= 57) {
                numCount++;
            }
        }
        assertTrue(numCount >= 2, "Password validation failed in common-lang3");
    }
}