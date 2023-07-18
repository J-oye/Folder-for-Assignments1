package deitel.chapter3;

public class Car {

    private String model;
    private  String year;
    private  double price;

    private double discountedRate;


    public Car(String model, String year,double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price>0){ this.price  = price;}
        else {
            System.out.println("invalid amount");
        }
    }
    public double getPrice() {
        return price;
    }

    public double getDiscountedRate() {
        return discountedRate;
    }

    public void setDiscountedRate(double discountedRate) {
        this.discountedRate = discountedRate;
    }

    public double discount(double price, double rate){
        discountedRate = price - (rate*100);
        return discountedRate;
    }



}
