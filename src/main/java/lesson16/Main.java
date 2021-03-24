package lesson16;

import lesson16.domain.Customer;
import lesson16.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setEmail("exampleAlex@mail.com");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);

        customer.setName("Alex");
        transaction.commit();
        session.close();

        customer.setName("New Name");
    }
}
