package com.nihalramtripathi.core.access_specifier.HumanResource;

public class JobPortal {

    void getFees(){
        Applications applications = new Applications();
        applications.getApplications();
        applications.getRegistrationFees();
        applications.clearData(); // Same Package
    }
}
