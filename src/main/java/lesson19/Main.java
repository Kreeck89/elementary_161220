package lesson19;

import lesson19.exception.WrongDigitalException;
import lesson19.service.ValidationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongDigitalException {
        ValidationService validationService = new ValidationService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digital for check:");
        int value = scanner.nextInt();

        boolean result = validationService.checkDigital(value);
        System.out.println("ValidationService.checkDigital result: " + result);
    }
}
