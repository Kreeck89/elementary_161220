package lesson6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String hello = "hello";
        System.out.println("hello.length(): " + hello.length());

        char[] chars = hello.toCharArray();
        System.out.println("chars: " + Arrays.toString(chars));

        String helloWithTrim = "   " + hello + "  ";
        System.out.println("helloWithTrim: " + helloWithTrim);
        System.out.println("helloWithTrim.trim(): " + helloWithTrim.trim());

        System.out.println("  .isEmpty(): " + "   ".isEmpty());
        System.out.println("  .trim().isEmpty(): " + "   ".trim().isEmpty());

        System.out.println("hello.charAt(2): " + hello.charAt(2));

        System.out.println(hello.concat(" str ").concat("sd"));

        String hello2 = "HellO";
        System.out.println("hello.equals(hello2): " + hello.equals(hello2));
        System.out.println("hello.equalsIgnoreCase(hello2): " + hello.equalsIgnoreCase(hello2));

        System.out.println("hello2.toLowerCase(): " + hello2.toLowerCase());
        System.out.println("hello2.toUpperCase(): " + hello2.toUpperCase());

        System.out.println("hello.substring(3): " + hello.substring(3));
        System.out.println("hello.substring(1, 3): " + hello.substring(1, 3));

        //From java 11:
        System.out.println("helloWithTrim.strip(): " + helloWithTrim.strip());
        System.out.println("\"   \".isBlank() " + "   ".isBlank());
        System.out.println("hello.concat(\" \").repeat(3): " + hello.concat(" ").repeat(3));

        String helloWithSpace = "HellO ";
        System.out.println("helloWithSpace.repeat(4): "
                + helloWithSpace
                .repeat(4)
                .concat(". The End"));

        //String format:
        String result = "User data: id=%d, accountId=%s, name=%s";
        System.out.println(result);

        String accountId = "1234567890";
        String name = "Alex";
        int id = 1;
        String formattedString = String.format(result, id, accountId, name);
        System.out.println("formattedString: " + formattedString);

        formattedString = String.format("str without format!", id, accountId, name);
        System.out.println("formattedString: " + formattedString);

        formattedString = String.format("New User data: id=%d, accountId=%s, name=%s", id, accountId, name);
        System.out.println("formattedString: " + formattedString);

//        String wrongResult = "User data: id=" + id
//                + ", accountId=" + accountId
//                + ", name=" + name;

        //RegEx example:
        String email = "email@example.com";
        Pattern pattern = Pattern.compile("^i7?t$");
        Matcher input = pattern.matcher("i7t");
        boolean matches = input.matches();
        boolean find = input.find();

        System.out.println("matches: " + matches);
        System.out.println("find: " + find);

    }
}
