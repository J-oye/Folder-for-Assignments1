package deitel.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {
    @Test
    public void checkThatObjectCanBeCreated(){
        Clock clock = new Clock(20,30,60);
        assertNotNull(clock);
    }

    @Test
    public void checkThatICanSetHour(){
        Clock clock = new Clock(20,30,60);
        clock.setHour(10);
        assertEquals(10,clock.getHour());
    }

    @Test
    public void testThatICanNotSetNegativeHourValue(){
        Clock clock = new Clock(20,30,60);
        clock.setHour(-50);
        assertEquals(-50,clock.getHour());
    }

    @Test
    public void testThatICanSetMinute(){
        Clock clock = new Clock(20,30,60);
        clock.setMinute(20);
        assertEquals(20,clock.getMinute());
    }

    @Test
    public void testThatICanNotSetNegativeMinuteValue(){
        Clock clock = new Clock(20,30,60);
        clock.setMinute(-10);
        assertEquals(-10,clock.getMinute());
    }

    @Test
    public void testThatICanSetSeconds(){
        Clock clock = new Clock(20,30,60);
        clock.setSeconds(45);
        assertEquals(45,clock.getSeconds());
    }

    @Test
    public void testThatICanNotSetNegativeSecondsValue(){
        Clock clock = new Clock(20,30,60);
        clock.setSeconds(-10);
        assertEquals(-10,clock.getSeconds());
    }


}
