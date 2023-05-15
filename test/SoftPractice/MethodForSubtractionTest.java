package SoftPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodForSubtractionTest {

    MethodForSubtraction subtract = new MethodForSubtraction();
    @Test
   public void checkIfSubtractionIsPossible(){
        // when
        int resultOf = subtract.subtraction(20,50);
        // assert
        assertEquals(30,resultOf);
    }

    @Test
    public void checkForNegativeSubtraction(){
        int outComeOf = subtract.subtraction(-10,-30);
        assertEquals(20,outComeOf);
    }



}