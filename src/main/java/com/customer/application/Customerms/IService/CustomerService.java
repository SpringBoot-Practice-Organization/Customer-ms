package com.customer.application.Customerms.IService;

import com.customer.application.Customerms.Entity.Customer;
import com.customer.application.Customerms.dto.Customerdto;

public interface CustomerService {

    Customer getCustomerById(int id);

    Customer saveCustomer(Customerdto dto);

    Customer updateCustomer(Customerdto dto,int id);

    boolean deleteCustomer(int id);
}
