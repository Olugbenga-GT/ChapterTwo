import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    Arithmetic arithmetic;
    @BeforeEach
    void setUp() {
        arithmetic = new Arithmetic (5, 20, 30);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatResultsCanTakeInVariable() {
        assertEquals(5, arithmetic.getFirstNumber());
        arithmetic.setFirstNumber(18);
        assertEquals(18, arithmetic.getFirstNumber());

        assertEquals(20, arithmetic.getSecondNumber());
        arithmetic.setSecondNumber(54);
        assertEquals(54, arithmetic.getSecondNumber());

        assertEquals(30, arithmetic.getThirdNumber());
        arithmetic.setThirdNumber(45);
        assertEquals(45, arithmetic.getThirdNumber());
    }


    @Test
    void testThatTheProductOfAllThreeNumbersCanBeComputed(){
        arithmetic.setFirstNumber(10);
        arithmetic.setSecondNumber(20);
        arithmetic.setThirdNumber(30);
        assertEquals(6000, arithmetic.calculateProduct());
    }

    @Test
    void testThatTheSumOfAllThreeNumbersCanBeComputed(){
        arithmetic.setFirstNumber(10);
        arithmetic.setSecondNumber(20);
        arithmetic.setThirdNumber(30);
        assertEquals(60, arithmetic.calculateSum());
    }

    @Test
    void testThatTheAverageOfAllThreeNumbersCanBeComputed(){
        arithmetic.setFirstNumber(10);
        arithmetic.setSecondNumber(20);
        arithmetic.setThirdNumber(30);
        assertEquals(20, arithmetic.calculateAverage());
    }

    @Test
    void testThatTheLargestOfAllThreeNumbersCanBeComputed(){
        arithmetic.setFirstNumber(10);
        arithmetic.setSecondNumber(20);
        arithmetic.setThirdNumber(30);
        assertEquals(30, arithmetic.computeHighest());
    }
}