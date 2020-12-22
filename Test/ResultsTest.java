import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultsTest {
    Results result ;
    @BeforeEach
    void setUp() {
        result = new Results(5, 20, 30);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatResultsCanTakeInVariable() {
        assertEquals(5, result.getFirstNumber());
        result.setFirstNumber(18);
        assertEquals(18, result.getFirstNumber());

        assertEquals(20, result.getSecondNumber());
        result.setSecondNumber(54);
        assertEquals(54, result.getSecondNumber());

        assertEquals(30, result.getThirdNumber());
        result.setThirdNumber(45);
        assertEquals(45, result.getThirdNumber());
    }

    @Test
     void testThatTheProductOfAllThreeNumbersCanBeComputed(){
        result.setFirstNumber(10);
        result.setSecondNumber(20);
        result.setThirdNumber(30);
        assertEquals(6000, result.calculateProduct());
    }
}