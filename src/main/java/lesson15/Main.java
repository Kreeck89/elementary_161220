package lesson15;

import lesson15.model.Customer;
import lesson15.service.CustomerService;
import lesson15.service.CustomerServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
//        Customer customer = new Customer();
//        customer.setEmail("email@example.com");
//        customer.setPassword("password");
//
//        customerService.save(customer);
//
//        Customer byID = customerService.getByID(3);
//        System.out.println(byID);

        List<Customer> customers = customerService.getAll();
        System.out.println(customers);
    }
}
