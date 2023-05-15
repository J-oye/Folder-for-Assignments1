package SoftPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsFloorTest {
    @Test
    public void checkThatNumberIsRoundedToNearestIntegerValue(){
        MathsFloor math = new MathsFloor();
       double nearestInteger = math.round(-3.9);
       assertEquals(-4,nearestInteger);
    }

}