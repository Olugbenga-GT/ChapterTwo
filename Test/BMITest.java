import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {
    BMI myBMI;

    @BeforeEach
    void setUp() {
        myBMI = new BMI(75, 1.75, 20.45);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testsThatTheBMIClassCanTakeVariables(){
        assertEquals(75, myBMI.getWeight());
        myBMI.setWeight(68);
        assertEquals(68, myBMI.getWeight());

        assertEquals(1.75, myBMI.getHeight());
        myBMI.setHeight(1.90);
        assertEquals(1.90, myBMI.getHeight());

    }

    @Test
    void testThatTheBMICanBeCalculated(){
        myBMI.setHeight(1.85);
        myBMI.setWeight(70);
        assertEquals(20.45, myBMI.calculateBMI());
    }

}