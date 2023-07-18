package deitel.chapter3;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantityOfPetrolInLitres;
    private double pricePerLitre;
    private double percentageDiscount ;
    private double amount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityOfPetrolInLitres, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityOfPetrolInLitres = quantityOfPetrolInLitres;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantityOfPetrolInLitres() {
        return quantityOfPetrolInLitres;
    }

    public void setQuantityOfPetrolInLitres(int quantityOfPetrolInLitres) {
        this.quantityOfPetrolInLitres = quantityOfPetrolInLitres;
        if (quantityOfPetrolInLitres > 0){this.quantityOfPetrolInLitres = quantityOfPetrolInLitres;}else {
            System.out.println("input correct quantity");
        }
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
        if (pricePerLitre > 0 ){getPricePerLitre();}
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
        if (percentageDiscount > 0){getPercentageDiscount();}
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPurchaseAmount(int quantityOfPetrolInLitres, double pricePerLitre, double percentageDiscount){
        amount = ((quantityOfPetrolInLitres * pricePerLitre)-percentageDiscount*100);
        return amount;
    }



}
