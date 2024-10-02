package com.crmtp.crmtp.Controllers;

import com.crmtp.crmtp.Entities.Customer;
import com.crmtp.crmtp.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name="/customers", produces="application/json")
@CrossOrigin(origins ="*")
        public class CustomerController {
    @Autowired
    private CustomerRepository customerRepo;

    @GetMapping("/")
    public List<Customer> getCustomers(){
        return customerRepo.findAll();
    }
}
