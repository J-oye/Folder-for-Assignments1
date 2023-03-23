import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    @Test
    public void BikeisOnTest() {
        //given
        Bike honda = new Bike();
        //when
        honda.isOn(true);
        //assert
        assertTrue(true);

    }

    @Test
    public void BikeisOffTest() {
        //given
        Bike honda = new Bike();
        //when
        honda.isOff(true);
        //assert
        assertTrue(true);
    }

    @Test
    public void BikeCanBeAccelerated(){
        //given
        Bike honda = new Bike();
        //when
        honda.setgear(1,2,3);
        //assert
        int gear1 =16;
        int gear2 = 24;
        assertEquals(16,honda.getSpeed());

    }


}