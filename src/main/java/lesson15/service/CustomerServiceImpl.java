package lesson15.service;

import lesson15.dao.CustomerDao;
import lesson15.dao.CustomerDaoImpl;
import lesson15.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void save(Customer customer) {
        CustomerDao customerDao = new CustomerDaoImpl();

        //some logic here!!!!
        if (customer.getEmail().isBlank()) {
            return;
        }
        customer.setEmail(customer.getEmail().toLowerCase());
        //some logic here!!!!

        customerDao.save(customer);
    }

    @Override
    public Customer getByID(long id) {
        CustomerDao customerDao = new CustomerDaoImpl();

        //some logic and call other services here!!!

        return customerDao.getById(id);
    }

    @Override
    public List<Customer> getAll() {
        CustomerDao customerDao = new CustomerDaoImpl();

        //some logic and call other services here!!!

        return customerDao.getAll();
    }
}
