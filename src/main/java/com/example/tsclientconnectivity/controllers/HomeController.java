package com.example.tsclientconnectivity.controllers;



import com.example.tsclientconnectivity.models.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class HomeController {

    private final List<Customer> customers=new ArrayList<>();

    public HomeController(){
        customers.add(new Customer(2,69,"Linus"));
        customers.add(new Customer(6,442069,"Prince"));
    }

    
    @GetMapping("/")
    public String hello(){
        return "<h1>Hello/<h1>";
    }

    @Value("${server.port}")
    private String port;


    @GetMapping("/port")
    public String port(){return port;}

    @GetMapping("/client")
    public List<Customer> customers(){


        return customers;

    }
    
    @PostMapping("/client")
    public List<Customer> customers(@RequestBody Customer customer){
        customers.add(customer);
        return customers;
    }

//    @RequestMapping(value = "/client", method = RequestMethod.POST)
//    public ResponseEntity<Object> customers(@RequestBody Customer customer) {
//        customers.add(customer);
//        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
//    }
}
