package deitel.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {

    @Test
    public void checkThatHeartRatesCanBeCreated(){
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        assertNotNull(heartRates);
    }

    @Test
    public void setFirstName() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.setFirstName("james");
        assertEquals("james",heartRates.getFirstName());
    }

    @Test
    public void setLastname() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.setLastname("babz");
        assertEquals("babz",heartRates.getLastname());
    }

    @Test
    public void setDay() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.setDay(5);
        assertEquals(5,heartRates.getDay());
    }

    @Test
    public void setMonth() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.setMonth("april");
        assertEquals("april",heartRates.getMonth());
    }

    @Test
    public void setYear() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.setYear(1999);
        assertEquals(1999,heartRates.getYear());
    }

    @Test
    public void calculateAge() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.calculateAge(1999);
        assertEquals(24,heartRates.calculateAge(1999));
    }

    @Test
    public void maximumHeartRateCalculation() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.maximumHeartRateCalculation(24);
        assertEquals(196,heartRates.maximumHeartRateCalculation(24));
    }

    @Test
    void targetHeartRate() {
        HeartRates heartRates =new HeartRates("james","petre",4,"march",1990);
        heartRates.targetHeartRate(196);
        assertEquals(98,heartRates.targetHeartRate(196));
    }
}