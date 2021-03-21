package lesson15.dao;

import lesson15.model.Customer;

import java.util.List;

public interface CustomerDao {

    void save(Customer customer);

    Customer getById(long id);

    List<Customer> getAll();
}
