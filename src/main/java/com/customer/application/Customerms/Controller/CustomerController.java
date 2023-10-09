package com.customer.application.Customerms.Controller;

import com.customer.application.Customerms.Entity.Customer;
import com.customer.application.Customerms.IService.CustomerService;
import com.customer.application.Customerms.dto.Customerdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/get/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customerdto customerdto){
        return  customerService.saveCustomer(customerdto);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customerdto customerdto,  @RequestParam int id){
        return customerService.updateCustomer(customerdto,id);
    }

    @DeleteMapping("/delete/{id}")
    public  boolean deleteCustomer(@PathVariable int id){
        return customerService.deleteCustomer(id);
    }
}
