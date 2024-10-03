package com.crmtp.crmtp.Controllers;
import com.crmtp.crmtp.Entities.Customer;
import com.crmtp.crmtp.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path="/customers", produces="application/json")
@CrossOrigin(origins ="*")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepo;
    @GetMapping("/show")
    public List<Customer> getCustomers(){
        return customerRepo.findAll();
    }
    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        return customerRepo.findById(id).get();
    }
    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerRepo.save(customer);
        return ResponseEntity.created(URI.create("/customer/"+ savedCustomer.getId())).body(savedCustomer);
    }
    @DeleteMapping("delete/{id}")
    public void deleteRole(@PathVariable("id") Integer id){
        customerRepo.deleteById(id);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Integer id, @RequestBody Customer customer){
        if(!customerRepo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        customer.setId(id);
        Customer updateCustomer = customerRepo.save(customer);
        return ResponseEntity.ok(updateCustomer);
    }
}