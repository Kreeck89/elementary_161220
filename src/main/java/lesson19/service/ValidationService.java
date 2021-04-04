package lesson19.service;

import lesson19.exception.WrongDigitalException;

public class ValidationService {

    public boolean checkDigital(int value) throws WrongDigitalException {
        if (value == 0) {
            throw new WrongDigitalException();
        }

        return value > 0;
    }
}
