package lesson5;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        Object o = new Object();
//        int i = 10;
//        Class<?> aClass = o.getClass();
//        Parrot parrot1 = new Parrot();
//        Parrot parrot2 = new Parrot();
//        parrot1.getClass();
//
//        System.out.println("parrot1.equals(parrot2): "
//                + parrot1.equals(parrot2));
//
//        System.out.println("parrot1 == parrot2: "
//                + (parrot1 == parrot2));
//
//        parrot1 = parrot2;
//        System.out.println("parrot1 == parrot2: "
//                + (parrot1 == parrot2));
//
//        System.out.println("parrot1.getName(): " + parrot1.getName());
//        System.out.println("parrot2.getName(): " + parrot2.getName());
//
//        parrot1.setName("Alex");
//        System.out.println("parrot1.getName(): " + parrot1.getName());
//        System.out.println("parrot2.getName(): " + parrot2.getName());
//
//        System.out.println("parrot1.hashCode(): " + parrot1.hashCode());
//        System.out.println("parrot1.toString(): " + parrot1.toString());
////        parrot1.finalize(); //устаревший метод


//        User user1 = new User();
//        user1.setAge(10);
//        user1.setEmail("mail");
//        user1.setPhone("777");
//        user1.setName("Alex");
//
//        User user2 = new User();
//        user2.setName("Bob");
//        user2.setPhone("777");
//        user2.setEmail("mail");
//
//        System.out.println("user1.equals(user2): " + user1.equals(user2));

        int first = 10;
        long second = 100;
        long primitives = primitives(first, second);
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("primitives result: " + primitives);

        User user = new User();
        String email = "alex@mail.ua";
        /*User objectsExampleUser = */
        System.out.println("user.getEmail(): " + user.getEmail());
        objectsExample(user, email);
  /*      System.out.println("objectsExampleUser.getEmail(): "
                + objectsExampleUser.getEmail());*/
        System.out.println("user.getEmail(): " + user.getEmail());
    }

    private static long primitives(int first, long second) {
        System.out.println(++first);
        System.out.println(++second);
        return first + second;
    }

    private static void objectsExample(User user, String email) {
        user.setEmail(email);
//        return user;
    }
}
