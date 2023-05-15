package Reflection;

import java.util.Scanner;

public class Person {
    private String getstate(String state){
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter your state");
        state = input.nextLine();
        return state;

    }
}
