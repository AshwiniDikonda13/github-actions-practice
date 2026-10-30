
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testAddition() {
        assertEquals(30, calculator.add(20, 10))
    }

    @Test
    fun testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10))
    }

    @Test
    fun testMultiplication() {
        assertEquals(200, calculator.multiply(20, 10))
    }

    @Test
    fun testDivision() {
        assertEquals(2, calculator.divide(20, 10))
    }

    @Test
    fun testDivisionByZero() {
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(20, 0)
        }
    }
}
