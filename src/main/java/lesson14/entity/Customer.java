package lesson14.entity;

import lombok.Data;

@Data
public class Customer {
    private long id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String password;
}
