package ru.bikmeev.thymeleaf_basics.repository;

import org.springframework.stereotype.Service;
import ru.bikmeev.thymeleaf_basics.entities.Customer;

import java.util.ArrayList;
import java.util.List;

//@Component @Service @Repository @Controller @RestController
@Service
public class CustomerRepository {
    private List<Customer> customerDatabase;


    public CustomerRepository() {
        this.customerDatabase = new ArrayList<>(List.of(
                new Customer("Joe", "xxx@yahoo.com"),
                new Customer("Tom", "yyy@google.com"),
                new Customer("Dana", "zzz@google.com")
        ));
    }

    public List<Customer> getAll() {
        return new ArrayList<>(customerDatabase);
    }
}
