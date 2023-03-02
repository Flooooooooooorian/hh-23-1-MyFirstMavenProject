
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyFirstJavaApplicationTest {

    @Test
    void add_when3And7_thenReturn10() {
        //GIVEN
        int value1 = 3;
        int value2 = 7;

        //WHEN
        int actual = MyFirstJavaApplication.add(value1, value2);

        //THEN
        assertEquals(10, actual);
    }

    @Test
    void isBiggerThanAHundret_when101_thenReturnTrue() {
        //GIVEN
        int value = 101;

        //WHEN
        boolean result = MyFirstJavaApplication.isBiggerThanAHundret(value);

        //THEN
        assertEquals(true, result);
    }

    @Test
    void isBiggerThanAHundret_when99_thenReturnFalse() {
        //GIVEN
        int value = 99;

        //WHEN
        boolean result = MyFirstJavaApplication.isBiggerThanAHundret(value);

        //THEN
        assertEquals(false, result);
    }

    @Test
    void isBiggerThanAHundret_when100_thenReturnFalse() {
        //GIVEN
        int value = 100;

        //WHEN
        boolean result = MyFirstJavaApplication.isBiggerThanAHundret(value);

        //THEN
        assertEquals(true, result);
    }
}
