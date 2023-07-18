package deitel.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerizationOfHealthRecordsTest {

    @Test
    public void  testThatComputerizationOfHealthRecordsCanBeCreated(){
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        assertNotNull(computerizationOfHealthRecords);
    }

    @Test
    public void setFirstName() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setFirstName("abbib");
        assertEquals("abbib",computerizationOfHealthRecords.getFirstName());
    }

    @Test
    public void setLastName() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setLastName("hann");
        assertEquals("hann",computerizationOfHealthRecords.getLastName());
    }

    @Test
    public void setGender() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setGender("male");
        assertEquals("male",computerizationOfHealthRecords.getGender());
    }

    @Test
    public void setDay() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setDay(2);
        assertEquals(2,computerizationOfHealthRecords.getDay());
    }

    @Test
    public void setMonth() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setMonth("may");
        assertEquals("may",computerizationOfHealthRecords.getMonth());
    }

    @Test
    public void setYearOfBirth() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setYearOfBirth(1990);
        assertEquals(1990,computerizationOfHealthRecords.getYearOfBirth());
    }

    @Test
   public void setHeight() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setHeight(25);
        assertEquals(25,computerizationOfHealthRecords.getHeight());
    }

    @Test
    public void setWeight() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.setWeight(30);
        assertEquals(30,computerizationOfHealthRecords.getWeight());
    }

    @Test
    public void calculateAgeInYears() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.calculateAgeInYears(2000);
        assertEquals(23,computerizationOfHealthRecords.calculateAgeInYears(2000));
    }

    @Test
    public void bmi() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.bmi(45,60);
        assertEquals(20,computerizationOfHealthRecords.bmi(45,60));
    }

    @Test
    public void maximumHeartRateCalculation() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.maximumHeartRateCalculation(23);
        assertEquals(197,computerizationOfHealthRecords.maximumHeartRateCalculation(23));
    }

    @Test
   public void targetHeartRate() {
        ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords("jay","obi","female",3,"march",2000,35,60);
        computerizationOfHealthRecords.targetHeartRate(197);
        assertEquals(98,computerizationOfHealthRecords.targetHeartRate(197));
    }
}