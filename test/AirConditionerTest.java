import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void AirConditionerTest(){
        // given
        AirConditioner onAirconditioner = new AirConditioner();

        //when
        onAirconditioner.toggleOn(true);

        // assert
        assertTrue(onAirconditioner.isOn());
    }

    @Test
    public void increaseTemperatureTest(){
        AirConditioner onAirconditioner = new AirConditioner();
        onAirconditioner.toggleOn(true);
        onAirconditioner.increase(16);
        assertEquals(17, onAirconditioner.getTemperature());
    }
    @Test
    public void decreaseTemperatureTest(){
        AirConditioner onAirconditioner = new AirConditioner();
        onAirconditioner.toggleOn(true);
        onAirconditioner.decrease(30);
        assertEquals(29,onAirconditioner.getTemperature());
    }
}


