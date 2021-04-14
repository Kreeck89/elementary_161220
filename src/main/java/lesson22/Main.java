package lesson22;

import lesson22.entity.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //STREAM CREATING
        Stream<Object> empty = Stream.empty();

        List<String> collection = Arrays.asList("first", "second", "third");
        Stream<String> arraysStream = collection.stream();

        Stream<Map.Entry<Object, Object>> stream1 = Map.of().entrySet().stream();

        int[] ints = {1, 2, 3, 4};
        IntStream intStream = Arrays.stream(ints);

        Stream<String> stream = Stream.of(" ", "first", "second", "third");

        //LAZY OPERATIONS:
        Stream<String> changed = stream
                .filter(val -> val.length() > 2)
                .skip(1)
                .distinct()
                .map(val -> val.concat("_CHANGED"))
                .limit(1)
                .sorted();

        //EAGER OPERATIONS:
        changed.forEach(System.out::println);

        List<String> list = List.of(" ", "first", "second", "third");
        list.stream()
                .filter(val -> val.length() > 2)
                .skip(1)
                .distinct()
                .map(val -> val.concat("_CHANGED"))
                .limit(1)
                .sorted()
                .forEach(System.out::println);

        System.out.println(list); // В ходе работы стрима коллекция не изменяется!!!!

//        for (int i = 0; i < list.size(); i++) {
//            String val = list.get(i);
//            val.concat("_CHANGED");
//            //some logic with variable
//        }

        List<String> collect = list.stream()
                .filter(fuckVariable -> !fuckVariable.isBlank())
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(list);

        Optional<String> first = list.stream()
                .filter(val -> val.length() > 2)
                .skip(1)
                .distinct()
                .map(val -> val.concat("_CHANGED"))
                .limit(1)
                .sorted()
                .findFirst();
        System.out.println(first);

        boolean anyMatch = list.stream().anyMatch(any -> any.contains("y"));
        System.out.println(anyMatch);

        boolean nonMatch = list.stream().noneMatch(any -> any.contains("y"));
        System.out.println(nonMatch);

        boolean allMatch = list.stream().allMatch(any -> any.length() > 0);
        System.out.println(allMatch);

//        list.parallelStream()


        //REFERENCE METHODS:
//        Function<String, Integer> function = s -> Integer.parseInt(s);
        Function<String, Integer> function = Integer::parseInt;
        System.out.println("function.apply(\"12312\"): " + function.apply("12312"));

//        List<Integer> integers = Stream.of("123", "456", "789")
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());

        Integer integer = 5;
//        Supplier<String> supplier = () -> integer.toString();
        Supplier<String> supplier = integer::toString;
        String result = supplier.get();

//        Function<String, String> stringFunction = string -> string.toUpperCase();
        Function<String, String> stringFunction = String::toUpperCase;
        String erRoR = stringFunction.apply("ErRoR");
        System.out.println(erRoR);

//        Function<String, User> functionUser = name -> new User(name);
        Function<String, User> functionUser = User::new;
        User alex = functionUser.apply("Alex");
        System.out.println(alex);

        //NEW DATE:
        Date date = new Date();
        System.out.println(date.getTime());
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(now.minusDays(10));
//        LocalDateTime.of()
    }
}
