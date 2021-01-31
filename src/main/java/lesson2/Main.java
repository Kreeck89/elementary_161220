package lesson2;

import lesson2.entity.Man;
import lesson2.entity.PoliceMan;
import lesson2.entity.User;
import lesson2.entity.Woman;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        //List example
//        List users = new ArrayList(10000);
//        users.add("first");
//        users.add(12);
//        users.add(new User());
//
//        System.out.println(users.get(0));
//        users.add(0, "second");
//        System.out.println(users.get(0));
//
//        System.out.println(users);
//        users.set(3, "third");
//        System.out.println(users);
////        users.set(4, "four"); // throws IndexOutOfBoundsException
//
//        System.out.println(users.size());
//        System.out.println("users.isEmpty(): " + users.isEmpty());
//
//        boolean contains = users.contains("first");
//        System.out.println("contains: " + contains);
//
//        users.remove("23");
//        users.clear();
//        System.out.println("users.size(): " + users.size());


//        //Set example
//
//        Set set = new HashSet();
//        set.add("First");
//        set.add("Second");
//        set.add(new User());
//        System.out.println("set.size(): " + set.size());
//
//        set.add("First");
//        System.out.println("set.size(): " + set.size());
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            if (next.equals(new Object())) {
//                //some logic
//            }
//        }
//
//        ArrayList users = new ArrayList(set);
//        System.out.println("users.get(0): " + users.get(0));


//        //Map example
//        Map map = new HashMap();
//        User alexUser = new User();
//        map.put("Alex", alexUser);
//        boolean alex = map.containsKey("Alex");
//        System.out.println("map.containsKey(\"Alex\"): " + alex);
//
//        System.out.println(map.containsValue(alexUser));
//        Set set = map.keySet();
//        Collection values = map.values();
//        System.out.println(values.contains(alexUser));
//
//        User user = (User) map.get("Alex");
//        System.out.println(user);
//
//        map.put("Alex", "Empty user");
//        System.out.println(map.get("Alex"));
//
//        map.put(null, "1234");
//        map.put(null, "0983");
//        map.put(null, "7777");
//        System.out.println(map.size());
//        System.out.println(map.get(null));

        //Generics

        ArrayList<User> users = new ArrayList<>();
//        users.add(12);
//        users.add("String_example");
        users.add(new User());
        users.add(new User());
        users.add(new Man());

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) != null) {
                System.out.println(users.get(i).getName());
            }
        }

        List<List<String>> stringList = new ArrayList<>();
        ArrayList<String> answers1 = new ArrayList<>();
        answers1.add("yes");
        answers1.add("no");
        stringList.add(answers1);

        HashMap<String, List<String>> answers = new HashMap<>();
        answers.put("Alex", answers1);
        answers.put("Bob", null);

        producerExample(users);
        ArrayList<Man> men = new ArrayList<>();
        men.add(new Man());
        producerExample(men);

        ArrayList<Woman> women = new ArrayList<>();
        women.add(new Woman());
        producerExample(women);

        superExample(users);
        superExample(men);
        superExample(new ArrayList<>());
//        superExample(women);
    }

    private static void producerExample(List<? extends User> users) {
        User user = users.get(0);
//        users.add(new User())
//        users.add(new Woman()); //Только для чтения данных из коллекции!!!
        //some logic
    }

    private static void superExample(List<? super Man> users) {
        users.add(new Man());
        users.add(new PoliceMan());
    }
}
