package com.nihalramtripathi.core.access_specifier.HumanResource;

public class Applications {

    public void getApplications(){
        System.out.println("Inside the get Application method");
    }

    private void getAmount(){
        System.out.println("Inside the get Amount method");
    }
     protected void getRegistrationFees(){
         getAmount();
        System.out.println("Inside the get Registration Fees method");
    }

     void clearData(){
        System.out.println("Inside the get ClearData method");
    }
}
