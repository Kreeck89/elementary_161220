package lesson21;

import lesson19.service.ValidationService;
import lesson21.funcrtionalInterface.BinaryOperator;
import lesson21.funcrtionalInterface.ConsumerInterface;
import lesson21.funcrtionalInterface.FunctionInterface;
import lesson21.funcrtionalInterface.PredicateInterface;
import lesson21.funcrtionalInterface.SupplierInterface;
import lombok.var;

import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //PREDICATE EXAMPLE:
        PredicateInterface<String> stringPredicateInterface = string -> string.isBlank();
        System.out.println("stringPredicateInterface.test(\"\"): " + stringPredicateInterface.test(""));

//        PredicateInterface<Integer> integerPredicateInterface = integer -> integer > 0;
        PredicateInterface<Integer> integerPredicateInterface = integer -> {
            if (integer > 0) {
                return true;
            }
            return false;
        };

        //CONSUMER EXAMPLE:
//        ConsumerInterface<String> stringConsumerInterface = string -> System.out.println("stringConsumerInterface. string: " + string);
        ConsumerInterface<String> stringConsumerInterface = string -> {
            if (string != null && !string.isBlank()) {
                System.out.println("stringConsumerInterface. string: " + string);
            } else {
                System.out.println("stringConsumerInterface. string is empty.");
            }
        };
        stringConsumerInterface.accept("SOME STRING!!!!");

        //FUNCTION EXAMPLE:
        FunctionInterface<Integer, String> functionInterface = integer -> {
            if (integer > 0) {
                Random random = new Random();
                int randomInteger = random.nextInt(integer);
                return "Random result: " + randomInteger;
            }
            return "integer is not positive digital";
        };
        System.out.println("functionInterface.apply(100): " + functionInterface.apply(100));

        //SUPPLIER EXAMPLE:
        SupplierInterface<Integer> supplierInterface = () -> new Random().nextInt(1000);
        System.out.println("supplierInterface.get(): " + supplierInterface.get());


        //BI_FUNCTION WITH THE SAME PARAMETERS = BINARY_OPERATOR:
        BinaryOperator<Integer> integerBinaryOperator = (int1, int2) -> int1 + int2;
        System.out.println("integerBinaryOperator.apply(555, 45): " + integerBinaryOperator.apply(555, 45));

        ValidationService validationService = new ValidationService();
        validationService = new ValidationService();
    }

    /**
     * Аналогичный метод FunctionalInterface PREDICATE.
     */
    private static Boolean privateTest(Integer integer) {
//        return integer > 0;
        if (integer > 0) {
            return true;
        }
        return false;
    }

    /**
     * Аналогичный метод FunctionalInterface CONSUMER
     */
    private static void privateAccept(String string) {
        if (string != null && !string.isBlank()) {
            System.out.println("stringConsumerInterface. string: " + string);
        } else {
            System.out.println("stringConsumerInterface. string is empty.");
        }
    }

    /**
     * Аналогичный метод FunctionalInterface FUNCTION
     */
    private static String privateApply(Integer integer) {
        if (integer > 0) {
            Random random = new Random();
            int randomInteger = random.nextInt(integer);
            return "Random result: " + randomInteger;
        }
        return "integer is not positive digital";
    }

    /**
     * Аналогичный метод FunctionInterface SUPPLIER
     */
    private static Integer privateGet() {
        return new Random().nextInt(1000);
    }
}
