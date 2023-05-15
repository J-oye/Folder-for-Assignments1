package SoftPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaisedToPowerTest {
    RaisedToPower pow = new RaisedToPower();
    @Test
    public void checkThatANumberIsRaised(){
        int sqrt = pow.raiseNumber(5,3);
        assertEquals(125,sqrt);
    }

    @Test
    public void negativeNumberRaised(){
        int powerOf = pow.raiseNumber(-5,-3);
        assertEquals(1.0,powerOf);

    }
}