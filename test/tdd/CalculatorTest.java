package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public void addNumberTest(){
        Calculator calculator = new Calculator();
        assertEquals(11, calculator.add(3 ,8));
    }

    @Test
    public void subtractNumberTest(){
    Calculator calculator = new Calculator();
     assertEquals(3, calculator.substract(5 ,2));  }

    @Test
    public void absoluteSubtractionTest(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.absoluteSubtraction(2, 5));
    }

    @Test
    public void multiplyNumber(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multipy(5, 2));

    }

    @Test
    public void divideNumber(){
      Calculator calculator = new Calculator();
      assertEquals(5, calculator.divide(10, 2));




    }

    }



