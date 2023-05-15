public class Arrayssss {
    public static void main(String[] args) {
        System.out.println(Arrayssss.add(1,2,10));
        System.out.println(Arrayssss.sum(16,50,10,20));

    }
    public static int add(int...number){
        int total = 0;
        for (int num:number){
            total += num;
        }
        return total;

    }

    public static double sum(double...digit){
        double total = 0;
        for (double dig : digit){
            total += dig;
        }
        return total;
    }
}
