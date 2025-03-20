import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class shoppingCartCalculatorTest {
    @Test
    void testCalculateTotalPrice() {
        assertEquals(0.00, shoppingCartCalculator.calculateTotal(0, 0), 0.01);

        assertEquals(5.00, shoppingCartCalculator.calculateTotal(5, 1), 0.01);

        assertEquals(10.00, shoppingCartCalculator.calculateTotal(5, 2), 0.01);
    }
}