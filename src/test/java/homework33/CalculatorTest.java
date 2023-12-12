package homework33;

import org.example.Homework.homework33.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void maxPositiveTest() {
        System.out.println("test maxPositive");

        int actualRes = calculator.max(10, 20);
        int expectedRes = 20;
        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    void maxNegativeTest() {
        System.out.println("test maxNegative");

        int actualRes = calculator.max(-10, -20);
        int expectedRes = -10;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void minPositiveTest() {
        System.out.println("test minPositive");

        int actualRes = calculator.min(10, 20);
        int expectedRes = 10;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void minNegativeTest() {
        System.out.println("test minNegative");

        int actualRes = calculator.min(-10, -20);
        int expectedRes = -20;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void percentPositiveTest() {
        System.out.println("test persentPositive");

        double actualRes = calculator.percent(2200, 5);
        double expectedRes = 110;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void percentNegativeTest() {
        System.out.println("test persentNegative");

        double actualRes = calculator.percent(-2200, 5);
        double expectedRes = -110;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void powerFirstPositiveTestV1() {
        System.out.println("test powerFirstPositiveTestV1");

        double actualRes = calculator.power(5, 2);
        double expectedRes = 25;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void powerFirstPositiveTestV2() {
        System.out.println("test powerFirstPositiveTestV2");

        double actualRes = calculator.power(5, -2);
        double expectedRes = 0.04;
        Assertions.assertEquals(expectedRes, actualRes);
    }

    @Test
    void powerFirstNegativeTestV1() {
        System.out.println("test powerFirstNegativeTestV1");

        double actualRes = calculator.power(-5, 2);
        double expectedRes = 25;
        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    void powerFirstNegativeTestV2() {
        System.out.println("test powerFirstNegativeTestV2");

        double actualRes = calculator.power(-5, -2);
        double expectedRes = 0.04;
        Assertions.assertEquals(expectedRes, actualRes);
    }
    @Test
    void powerFirstNegativeTestV3() {
        System.out.println("test powerFirstNegativeTestV3");

        double actualRes = calculator.power(-5, -3);
        double expectedRes = -0.008;
        Assertions.assertEquals(expectedRes, actualRes);
    }

}
