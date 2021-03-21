package lesson15.service;

import lesson15.model.Customer;

import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    Customer getByID(long id);

    List<Customer> getAll();
}
