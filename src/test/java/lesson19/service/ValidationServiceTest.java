package lesson19.service;

import lesson19.exception.WrongDigitalException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationServiceTest {
    private ValidationService validationService = new ValidationService();

    private static final int DIGITAL_HIGHER_ZERO = 12;
    private static final int DIGITAL_LOWER_ZERO = -12;
    private static final int DIGITAL_ZERO = 0;


    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @SneakyThrows
    @Test
    void checkDigitalHigherZero() {
        boolean result = validationService.checkDigital(DIGITAL_HIGHER_ZERO);

        assertTrue(result);
    }

    @SneakyThrows
    @Test
    void checkDigitalLowerZero() {
        boolean result = validationService.checkDigital(DIGITAL_LOWER_ZERO);

        assertFalse(result);
    }

    @Test
    void checkDigitalEqualsZero() {
        assertThrows(WrongDigitalException.class, () -> validationService.checkDigital(DIGITAL_ZERO));
    }
}
