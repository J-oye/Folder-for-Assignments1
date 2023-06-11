package deitel.chapter3;

public class Car {

    private String model;
    private  String year;
    private  double price;


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
        if (price<=0){price=0;} else if (price>0) {
            double newPrice=0;
            price = newPrice;

        }

    }
    public double getPrice() {
        return price;
    }



}
