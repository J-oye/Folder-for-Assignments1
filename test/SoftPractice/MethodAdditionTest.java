package SoftPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodAdditionTest {

    MethodAddition add = new MethodAddition();
    @Test
    public void testForSummation(){
        //  when
        int sumOf = add.addition(10,5);
        //  assert
        assertEquals(15,sumOf);
    }


    @Test
    public void testForNegativeNumberSummation(){
        int sumOf = add.addition(-20,-5);
        assertEquals(-0,sumOf);
    }

    @Test
    public void testForActualSummation(){
        int sumOf = add.addition(20,7);
        assertEquals(27,sumOf);
    }


}