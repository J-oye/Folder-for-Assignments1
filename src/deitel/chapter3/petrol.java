package deitel.chapter3;

public class petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("unilagroad","fuel",10,85.0,5.0);
        System.out.println(petrol.getTypeOfPetrol());
        System.out.println(petrol.getStationLocation());
        System.out.println(petrol.getQuantityOfPetrolInLitres());
        System.out.println(petrol.getPurchaseAmount(10, 85.0, 5.0));

    }
}
