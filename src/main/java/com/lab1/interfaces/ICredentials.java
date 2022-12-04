package com.lab1.interfaces;

import com.lab1.model.Employee;

public interface ICredentials {

    // generateEmailAddress
    //generatePassword
    //credentials

    public String generateEmailAddress(String firstName, String lastName, String department);

    public String generatePassword();

    public void showCredentials(Employee employee);

}
