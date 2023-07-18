package deitel.chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {

    @Test
    public void testThatPetrolPurchaseObjectCanBeCreated(){
    //given that i have a variable that can store a PetrolPurchase Object
        PetrolPurchase petrolPurchase;
        // when i initialize the variable
        petrolPurchase = new PetrolPurchase("enugu","fuel",10,4000,2);
    //then the variable should not be null
        assertNotNull(petrolPurchase);
    }
    @Test
    public void testThatICanSetPetrolLocation(){
        //given that i have a petrol purchase object
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        //when i try to set the location for it
        petrolPurchase.setStationLocation("lagos");
        //then  when i get the location it should be equal to  the one i set
        assertEquals("lagos",petrolPurchase.getStationLocation());
    }
    @Test
    public void testThatICanSetTypeOfPetrol(){
        //given that i have a petrol purchase object
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        //when i set the petrol type for it
        petrolPurchase.setTypeOfPetrol("kerosine");
        //then i should get the same petrol type that i set in return
        assertEquals("kerosine",petrolPurchase.getTypeOfPetrol());
    }

    @Test
    public void testThatICanSetQuantityOfPetrolInLiters(){
        //given that i have a petrol purchase object
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        //when i set the value of quantity that i bought
        petrolPurchase.setQuantityOfPetrolInLitres(10);
        // then i should get the same value i set in return
        assertEquals(10,petrolPurchase.getQuantityOfPetrolInLitres());
    }

    @Test
    public void testThatICanNotSetNegativeQuantityOfPetrol(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        petrolPurchase.setQuantityOfPetrolInLitres(-20);
        assertEquals(-20,petrolPurchase.getQuantityOfPetrolInLitres());
    }


    @Test
    public void testThatICanSetPricePerLiter(){
        //given that i have a petrol purchase object
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        //given that i have a petrol purchase object
        petrolPurchase.setPricePerLitre(600);
        // then i should get the same value i set in return
        assertEquals(600,petrolPurchase.getPricePerLitre());
    }

    @Test
    public void testThatICanNotSetNegativePricePerLiter(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        petrolPurchase.setPricePerLitre(-200);
        assertEquals(-200,petrolPurchase.getPricePerLitre());
    }

    @Test
    public void  testThatICanSetPercentageDiscount(){
        //given that i have a petrol purchase object
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        //when i set the value of percentage discount
        petrolPurchase.setPercentageDiscount(7);
        // then i should get the same value i set in return
        assertEquals(7,petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testThatICanNotSetNegativePercentageDiscount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        petrolPurchase.setPercentageDiscount(-2);
        assertEquals(-2,petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testThatICanGetPurchaseAmount(){
        //given that i have a petrol purchase object
        PetrolPurchase petrolPurchase = new PetrolPurchase("abia","fuel",20,500,5);
        //given that i have a petrol purchase object
        petrolPurchase.getPurchaseAmount(10,800,5);
        // then i should get the same value i set in return
        assertEquals(7500,petrolPurchase.getAmount());
    }
}