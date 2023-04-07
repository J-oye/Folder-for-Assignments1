
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    @Test
    public void BikeisOnTest() {
        //given
        Bike honda = new Bike();
        //when
        honda.toggleOn(true);
        //assert
        assertTrue(honda.isOn());
    }

    @Test
    public void BikeCanBeAccelerated(){
        //given
        Bike honda = new Bike();
        //when
        honda.toggleOn(true);
        honda.accelerate(15);
        //assert
        assertEquals(16,honda.getSpeed());
    }

    @Test
    public void BikeCanBeDeccelerated(){
        //given
        Bike honda = new Bike();
        //when
        honda.toggleOn(true);
        honda.deccelerate(16);
        //assert
        assertEquals(15,honda.getSpeed());

    }


}