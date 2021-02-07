package lesson4;

import lesson4.exception.CheckedException;
import lesson4.exception.UncheckedException;

import java.io.IOException;
import java.rmi.AccessException;
import java.util.ArrayList;
import java.util.Scanner;

import static lesson4.Constants.*;

public class Main {
    private static final String ORIGIN_TYPE = "ORIGIN";

    /**
     * @param args
     */
    public static void main(String[] args)/* throws IOException, InterruptedException */{
//        System.out.println(URL_TO_SERVICE2);

//        Information information = new Information();
//        String firstString = "first string";
//        try {
//            information.getList().add(firstString);
//        } catch (NullPointerException e) {
//            information.setList(new ArrayList<String>());
//            information.getList().add(firstString);
//        }
//        System.out.println(information.getList().get(0));
//
//
//        if (ORIGIN_TYPE.equalsIgnoreCase(information.getType())) {
//            System.out.println(ORIGIN_TYPE);
//        }
//
//        Thread.sleep(10000);
////        throw new NullPointerException(); // не проверяемая ошибка
//        throw new IOException(); // проверяемая ошибка (thr + enter)

        //TODO:

//        Main main = new Main(); //ПЛОХО!
//        main.print();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter pls some value:");
            String string = scanner.next();
            print(string);
        } catch (CheckedException e) {
            //logging 1
            e.printStackTrace();
        } catch (ArithmeticException | ArrayStoreException e) {
            //logic 2
            e.printStackTrace();
        }
//        catch (Exception e) {
//
//        }
        finally {
            System.out.println("FINALLY BLOCK!!!!");
        }

        //some logic....
    }

    private static void print(String string) throws CheckedException {
        if (string.length() < 3) {
            throw new CheckedException();
        }
        if (string.length() > 15) {
            throw new UncheckedException();
        }
        System.out.println("string: " + string);
    }
}
