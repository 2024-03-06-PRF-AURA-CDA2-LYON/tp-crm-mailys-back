package com.crmtp.crmtp.Repositories;

import com.crmtp.crmtp.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
