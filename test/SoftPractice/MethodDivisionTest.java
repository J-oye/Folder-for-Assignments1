package SoftPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodDivisionTest {

    @Test
    public void testIfDivisionIsPossible(){
        MethodDivision divide = new MethodDivision();
        int divisionResult = divide.division(10,100);
        assertEquals(10,divisionResult);

    }

}