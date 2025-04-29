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


}
