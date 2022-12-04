package com.lab1.service;

import com.lab1.interfaces.ICredentials;
import com.lab1.model.Employee;
import com.lab1.utilities.GeneratePasswordUtil;

public class CredentialsService implements ICredentials {


    /**
     * @param firstName firstName
     * @param lastName lastName
     * @param department department
     * @return emailAddress
     */
    @Override
    public String generateEmailAddress(String firstName, String lastName, String department) {
        return firstName + lastName + "@" + department + ".gl.com";
    }

    /**
     * @return password
     */
    @Override
    public String generatePassword() {
        GeneratePasswordUtil generatePasswordUtil = new GeneratePasswordUtil();
        return generatePasswordUtil.generateRandomPassword();

    }

    /**
     * @param employee employee
     */
    @Override
    public void showCredentials(Employee employee) {
        System.out.println("Hi " + employee.getFirstName() + " Your credentials are generated");
        System.out.println("Email ID: " + employee.getEmail());
        System.out.println("Your password is:- " + employee.getPassword());
    }
}
