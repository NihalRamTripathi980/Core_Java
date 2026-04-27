package com.nihalramtripathi;


public class Main {
    public static void main(String[] args) {
      PasswordValidator passwordValidator = new PasswordValidator("Nihal@123");
      passwordValidator.validate();
        System.out.printf("Is Validated : "+ passwordValidator.validate());
        System.out.printf("\nIs Validated With Stream : "+ passwordValidator.validateWithStream());
    }
}