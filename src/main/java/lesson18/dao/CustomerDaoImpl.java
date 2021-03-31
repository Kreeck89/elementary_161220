package lesson18.dao;

import lesson18.model.Customer;
import lesson18.service.CustomerServiceImpl;
import lesson18.util.HibernateUtil;
import lesson18.util.LoggerUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.logging.Level;

public class CustomerDaoImpl implements CustomerDao {
    //    Logger logger = LoggerUtil.getLogger(CustomerDaoImpl.class);
    Logger logger = Logger.getLogger(CustomerDaoImpl.class);

    @Override
    public void save(Customer customer) {
//        logger.log(Level.INFO, customer.toString());

//        logger.debug(customer.toString());
        logger.debug(String.format("save. customer{id=%d, email=%s}", customer.getId(), customer.getEmail()));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
