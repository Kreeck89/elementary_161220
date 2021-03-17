package lesson14.service;

import lesson14.database.Database;
import lesson14.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static final String SELECT_ALL_CUSTOMERS_QUERY = "SELECT * FROM customers";
    private static final String SAVE_CUSTOMER_QUERY = "INSERT INTO customers (name, surname, email, password, age) VALUES (?,?,?,?,?)";


    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_CUSTOMERS_QUERY);
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setName(resultSet.getString("name"));
                customer.setSurname(resultSet.getString("surname"));
                customer.setAge(resultSet.getInt("age"));
                customer.setEmail(resultSet.getString("email"));
                customer.setPassword(resultSet.getString("password"));
                customers.add(customer);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public void save(Customer customer) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_CUSTOMER_QUERY)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getSurname());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getPassword());
            preparedStatement.setInt(5, customer.getAge());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
