package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void testConvert() {
        CurrencyConverter converter = new CurrencyConverter();
        double originalAmount = 99.99;
        double conversionRate = 2.70;
        double expected = 269.97;
        double actual = converter.convert(originalAmount, conversionRate);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testIsValid() {
        CurrencyConverter converter = new CurrencyConverter();

        assertTrue(converter.isValid(50.0, 1.5));
        assertFalse(converter.isValid(-10.0, 1.5));
        assertFalse(converter.isValid(100.0, 0.0));
        assertTrue(converter.isValid(50.0, 1.5));     
        assertFalse(converter.isValid(-0.01, 5.0));   
        assertFalse(converter.isValid(100.0, 0.0));
        assertFalse(converter.isValid(-10.0, -2.5));
    }
}
