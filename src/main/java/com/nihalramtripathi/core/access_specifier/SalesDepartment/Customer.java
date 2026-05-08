package com.nihalramtripathi.core.access_specifier.SalesDepartment;

import com.nihalramtripathi.core.access_specifier.HumanResource.Applications;

public class Customer {

    void getCustomerFees(){
        Applications applications = new Applications();
        applications.getApplications();
        Applications invoice = new Invoice();
        invoice.getApplications();
       // invoice.getCustomerFees();
      //  invoice.getApplications();
    }
}
