package com.customer.application.Customerms.Serviceimpl;

import com.customer.application.Customerms.Entity.Customer;
import com.customer.application.Customerms.IService.CustomerService;
import com.customer.application.Customerms.Repository.CustomerRepo;
import com.customer.application.Customerms.dto.Customerdto;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;


    @Override
    public Customer getCustomerById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public Customer saveCustomer(Customerdto dto) {
        Customer customer = new Customer();
        customer.setCustomerName(dto.getName());
        customer.setPlace(dto.getPlace());
        customer.setEmail(dto.getEmail());
        customer.setPhnumber(dto.getPhnumber());

        return repo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customerdto dto,int id) {
        Customer customer = repo.findById(id).get();

        if (dto != null){
            if (dto.getName() != null)
                customer.setCustomerName(dto.getName());
            if (dto.getPlace() != null)
                customer.setPlace(dto.getPlace());
            if (dto.getPhnumber() != 0)
                customer.setPhnumber(dto.getPhnumber());
            if (dto.getEmail() != null)
                customer.setEmail(dto.getEmail());
        }
        return repo.save(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        if (id != 0 && repo.findById(id).get() != null)
            repo.deleteById(id);
        else
            return false;

        return true;
    }
}
