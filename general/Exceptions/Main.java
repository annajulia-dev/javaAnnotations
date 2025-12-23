package general.Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /* EXERCISE 1
        int denominator, numerator;
        System.out.println("denominator: ");
        denominator = scanner.nextInt();
        System.out.println("numerator: ");
        numerator = scanner.nextInt();
        try {
            int result = numerator / denominator;
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        */

        int age = scanner.nextInt();
        try{
            checkAge(age);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Acess denied!");
        }
        else{
            System.out.println("Acess granted!");
        }
    }
}
