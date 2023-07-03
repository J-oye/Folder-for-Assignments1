package deitel.chapter3;

public class CarApplication {
    public static void main(String[] args) {
        Car toyota = new Car("camry","2001",100000.0);
        Car benz = new Car("benz190","2001",300000.0);
        System.out.println("car model is "+toyota.getModel());
        System.out.println("year is "+toyota.getYear());
        System.out.println("car price is "+toyota.getPrice());
        System.out.println(" your discounted price is "+toyota.discount(100000.0, 0.05));
        toyota.setPrice(900000.0);
        System.out.println("car model is "+toyota.getPrice());
        System.out.println("car model is "+benz.getModel());
        System.out.println("year is "+benz.getYear());
        System.out.println("car price is "+benz.getPrice());
        System.out.println(" your discounted price is "+benz.discount(300000.0, 0.07));
    }

}
