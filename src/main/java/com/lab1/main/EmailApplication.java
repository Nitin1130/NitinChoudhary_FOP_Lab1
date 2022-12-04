package com.lab1.main;

import com.lab1.interfaces.ICredentials;
import com.lab1.model.Employee;
import com.lab1.service.CredentialsService;

import java.util.Scanner;

public class EmailApplication {

    /**
     * @param choice choice
     * @return department
     */
    public static String setDepartment(int choice) {
        String department = "";
        switch (choice) {
            case 1 -> department = "tech";
            case 2 -> department = "adm";
            case 3 -> department = "hr";
            case 4 -> department = "lg";
            default -> System.out.println("Enter a Valid Department Option!");
        }
        return department;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter Your First Name:- ");
        String firstName = scan.next();

        System.out.print("Enter Your Last Name:- ");
        String lastName = scan.next();

        Employee employee = new Employee(firstName, lastName);
        ICredentials credentialsService = new CredentialsService();

        //user input options for departments
        System.out.println("Please choose the department from the following options");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
        System.out.print("Enter Choice:- ");

        int option = scan.nextInt();

        String generatedEmail = credentialsService.generateEmailAddress(employee.getFirstName().toLowerCase(),
                                                                employee.getLastName().toLowerCase(), setDepartment(option));
        String generatedPassword = credentialsService.generatePassword();

        employee.setEmail(generatedEmail);
        employee.setPassword(generatedPassword);
        credentialsService.showCredentials(employee);
    }
}