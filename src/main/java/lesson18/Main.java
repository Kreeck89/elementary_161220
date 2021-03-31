package lesson18;

import lesson18.model.Customer;
import lesson18.service.CustomerService;
import lesson18.service.CustomerServiceImpl;
import lesson18.util.LoggerUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        System.err.println("some error");

//        Logger logger = Logger.getLogger(Main.class.getName());
//        logger.log(Level.INFO, "some info");

//        Logger logger = LoggerUtil.getLogger(Main.class);
//        logger.log(Level.INFO, "some info");


        CustomerService customerService = new CustomerServiceImpl();
        Customer customer = new Customer();
        customer.setEmail("email7776@example.com");
        customer.setPassword("password");

        customerService.save(customer);

        customerService.otherMethod();
    }
}
