package com.crmtp.crmtp.Controllers;

import com.crmtp.crmtp.Entities.Customer;
import com.crmtp.crmtp.Entities.Order;
import com.crmtp.crmtp.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
@RequestMapping(path="/orders",produces="application/json")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    private OrderRepository orderRepo;

    @GetMapping("/show")
    public List<Order> getOrders(){
        return orderRepo.findAll();
    }



}