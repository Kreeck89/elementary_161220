package lesson1;

public class PrintHelper {
    public static void print(String string) {
        if (validate(string)) {
            System.out.println(string);
        }
    }

    private static boolean validate(String string) {
        return !string.isEmpty();
    }
}
