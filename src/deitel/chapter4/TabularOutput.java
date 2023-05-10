package deitel.chapter4;

public class TabularOutput {
    public static void main(String[] args){
        for (int N =1;N<6;N++){
            System.out.println(N);
            for (int N2 =N; N2<6;N2++){
                System.out.println(N2*N);
                for (int N3=N;N3<6;N3++){
                    System.out.println(N*N2*N3);
                    for (int N4 =N;N4<6;N4++){
                        System.out.println(N*N2*N3*N4);
                    }
                }

            }
        }


    }
}
