import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MultiplicationWithoutSymbolTest {
    @Test
    public void multiplyWithoutSymbolTest(){
        Multiplication calculation = new Multiplication();
       int resultOfMultiplication = calculation.multiply(5,2);
        assertEquals(10,resultOfMultiplication);
    }

}