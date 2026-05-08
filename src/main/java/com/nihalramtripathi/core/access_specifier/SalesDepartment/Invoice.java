package com.nihalramtripathi.core.access_specifier.SalesDepartment;

import com.nihalramtripathi.core.access_specifier.HumanResource.Applications;

public class Invoice extends Applications{

    void getCustomerFees(){
        Applications applications = new Applications();
        applications.getApplications();
        getRegistrationFees(); // Outside the package but inside the sub-class
    }
}
