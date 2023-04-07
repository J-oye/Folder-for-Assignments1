import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDrillerTest {
    @Test
    public void purchaseTestDrillerTest(){
        //given
        TestDriller testDriller = new TestDriller();
        //when
        testDriller.purchase(500);
        testDriller.amount();
        //assert
        assertEquals(500_000,testDriller.amount());
    }

   @Test
    public void  purchaseTestDriller(){
        TestDriller testDriller = new TestDriller();
        testDriller.purchase(10);
        testDriller.amount();
        assertEquals(16_000,testDriller.amount());
    }

}
