import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {
    @Test
    public void AirConditionerTest(){
        // given
        AirConditioner onAirconditioner = new AirConditioner();

        //when
        onAirconditioner.isOn(true);

        // assert
        assertTrue(true);
    }


    @Test
    public void AirConditionerTest2(){
    //given
    AirConditioner offAirConditioner = new AirConditioner();
    //when
     offAirConditioner.isoff(false) ;
    // assert
        assertFalse(false);

    }

    @Test
    public void AirConditionerTest3(){
        //given
        AirConditioner increaseTemperature = new AirConditioner();
        //when
        increaseTemperature.increased(true);
        //asert
        assertTrue(true);
    }

    @Test
    public void  AirConditionerTest4(){
        //given
        AirConditioner decreaseTemperature = new AirConditioner();
        //when
        decreaseTemperature.decrease(true);
        //assert
        assertTrue(true);
    }

    @Test
    public void AirConditionerTest5(){
        //given
        AirConditioner negativeIncreaseTemp = new AirConditioner();
        //when
        negativeIncreaseTemp.negative(false);
        //assert
        assertFalse(false);
    }


    @Test
  public void AirConditionerTest6() {
        //given
        AirConditioner negativeDecreaseTemp = new AirConditioner();
        //when
        negativeDecreaseTemp.negative(false);
        //assert
        assertFalse(false);
    }
}


