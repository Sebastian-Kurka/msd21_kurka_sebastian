package at.fhj.msd;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }


    @Test
    void testAdd() {

        Assertions.assertEquals(20, calc.add(15.0, 5.0));
        int result = 20;
        Assertions.assertEquals(result, calc.add(15.0, 5.0));
        }

    @Test
    void testMinus() {

        Assertions.assertEquals(20, calc.minus(25.0, 5.0));
        Assertions.assertEquals(-20, calc.minus(5.0,25.0));
    }

    @Test
    void testMultiply(){

        Assertions.assertEquals(20, calc.multiply(4.0, 5.0));
        Assertions.assertEquals(0, calc.multiply(20.0, 0.0));
    }

    @Test
    void testDivide() {

        Assertions.assertEquals(4, calc.divide(20.0, 5.0));
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calc.divide(20.0, 0.0));
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, calc.divide(-20.0 , 0.0));
    }

    @Test
    void testFacttorial() {

        Assertions.assertEquals(120, calc.factorial(5));
        Assertions.assertEquals(24, (4*3*2));
        Assertions.assertEquals(0, calc.factorial(-10));
    }




}
