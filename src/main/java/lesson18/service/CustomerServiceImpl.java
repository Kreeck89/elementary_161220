package lesson18.service;

import lesson18.dao.CustomerDao;
import lesson18.dao.CustomerDaoImpl;
import lesson18.model.Customer;
import lesson18.util.LoggerUtil;
import org.apache.log4j.Logger;

import java.util.logging.Level;

public class CustomerServiceImpl implements CustomerService {
    //    Logger logger = LoggerUtil.getLogger(CustomerServiceImpl.class);
    Logger logger = Logger.getLogger(CustomerServiceImpl.class);

    @Override
    public void save(Customer customer) {
//        logger.log(Level.INFO, customer.toString());
        logger.debug(customer.toString());

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
    public void otherMethod() {
//        logger.log(Level.INFO, "information from otherMethod");
//        logger.log(Level.INFO, "information from otherMethod");
//        logger.log(Level.INFO, "information from otherMethod");
        //
        logger.debug("information from otherMethod");
        logger.debug("information from otherMethod");
        logger.debug("information from otherMethod");
    }
}
