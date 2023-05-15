package SoftPractice;

public class EnhancedLoop {
    public static void main(String[] args) {
        int[]array = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        for (int number: array){
            total +=  number;
        }
        System.out.println(total);


        String[]words = {"john","mum","man","Adam","segs"};

        for (String names: words){
            System.out.println(names);
        }

    }
}
