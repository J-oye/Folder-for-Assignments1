package deitel.chapter1;

public class MethodOverloadingMain {
    public static void main(String[] args) {
        MethodOverloading loading = new MethodOverloading();
        loading.add(1,2);
        loading.add(3,5,10);
        loading.add(5,2.5);
        System.out.println(loading.add(1,2));
        System.out.println(loading.add(5,2.5));
        System.out.println(loading.add(3,5,10));
    }
}
