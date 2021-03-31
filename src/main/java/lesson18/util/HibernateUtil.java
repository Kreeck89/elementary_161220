package lesson18.util;

import lesson18.model.Customer;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.WrongClassException;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.WriteAbortedException;

public class HibernateUtil {
    static Logger logger = Logger.getLogger(HibernateUtil.class);

    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Customer.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

//                throw new Exception(); // Раскомментировать для теста логгирования Ошибки!
            } catch (Exception e) {
                logger.error("MY SESSION FACTORY ERROR!!!!!!", e);
//                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }
}
