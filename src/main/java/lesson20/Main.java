package lesson20;

import lesson20.interfaceExample.NewInterfaceExample;
import lesson20.interfaceExample.NewInterfaceExample2;
import lesson20.interfaceExample.NewInterfaceExampleImpl;
import lesson20.interfaceExample.NewInterfaceExampleImpl2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) throws Throwable {

        //INTERFACE 8+
//        NewInterfaceExample.print("static method of interface");
//        NewInterfaceExample2.print("static method of interface");
//
//        NewInterfaceExampleImpl newInterfaceExample = new NewInterfaceExampleImpl();
//        newInterfaceExample.defaultPrint("EXAMPLE");

//        NewInterfaceExampleImpl2 newInterfaceExampleImpl2 = new NewInterfaceExampleImpl2();
//        newInterfaceExampleImpl2.defaultPrint("ExAmPlE");

        //OPTIONAL

        Optional optional = checkObject(new Object());
        boolean optionalPresent = optional.isPresent();

//        Object optionalObject;
//        if (optional.isPresent()) {
//            optionalObject = optional.get();
//        } else {
//            optionalObject = new Object();
//        }
        Object optionalOrElseObject = optional.orElse(new Object());


//        Object optionalObject;
//        if (optional.isPresent()) {
//            optionalObject = optional.get();
//        } else {
//            throw new IOException();
//        }
        Object optionalOrThrowObject = optional.orElseThrow(IOException::new);

        //LAMBDA INTRODUCTION:
        System.out.println("calculate(10, 20): " + calculate(10, 20));

        IntBinaryOperator tComparator = (a, b) -> a + b + 1000;
        System.out.println("tComparator: " + tComparator.applyAsInt(10, 20));

        IntBinaryOperator tComparator100000 = (a, b) -> a + b + 100000;
        System.out.println("tComparator100000: " + tComparator100000.applyAsInt(10, 20));

        List<String> list = Arrays.asList("fourth", "first", "second", "third");
        System.out.println(list);
        //ИСПОЛЬЗОВАЛОСЬ ДО java 8:
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String string1, String string2) {
//                return string1.compareTo(string2);
//            }
//        });

        //ИСПОЛЬЗОВАЛОСЬ С java 8:
        Collections.sort(list, (string1, string2) -> string1.compareTo(string2));
        System.out.println(list);
    }

    private static Optional checkObject(Object object) {
//        if (Objects.isNull(object)) {
//            return Optional.empty();
//        }
//        return Optional.of(object);

        return Optional.ofNullable(object);
    }

    private static int calculate(int a, int b) {
        return a + b + 1000;
    }

    private static int calculateWith100000(int a, int b) {
        return a + b + 100000;
    }
}
