package lesson14;

import lesson14.database.Database;
import lesson14.entity.Customer;
import lesson14.service.CustomerService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
//        List<Customer> customers = customerService.getAll();
//        System.out.println(customers);

        Customer customer = new Customer();
        customer.setEmail("example777@mail.ua");
        customer.setPassword("password");
        customer.setAge(10);
        customer.setName("BoB");
        customer.setSurname("Unknown");
        customerService.save(customer);
    }
}
