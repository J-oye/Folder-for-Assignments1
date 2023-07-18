package deitel.chapter3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
     public void checkThatCarObjectCanBeCreated(){
        //given i have a variable that can store a car object
        Car car ;
        //when i initialize the variable
        car =  new Car("rav4","2001",90000);
        // then the variable should not be null
        assertNotNull(car);
    }

    @Test
    public void checkThatICanSetCarModel(){
       Car car =  new Car("rav4","2001",90000);
       car.setModel("benzGlk");
       assertEquals("benzGlk",car.getModel());
    }


    @Test
    public void checkThatICanSetCarYear(){
        Car car =  new Car("rav4","2001",90000);
        car.setYear("2012");
        assertEquals("2012",car.getYear());
    }



    @Test
    public void testThatICanSetCarPrice(){
        Car  car =  new Car("rav4","2001",90000);
        car.setPrice(200000);
        assertEquals(200000,car.getPrice());
    }


    @Test
    public void testThatICanNotSetWrongPriceValue(){
            Car  car =  new Car("rav4","2001",90000);
            car.setPrice(-200000);
            assertEquals(-200000,car.getPrice());


    }

    @Test
    public void testThatCustomerCanGetDisCountOnPrice(){
        Car  car =  new Car("rav4","2001",90000);
        car.discount(200000,9);
        assertEquals(199100,car.getDiscountedRate());
    }




}
