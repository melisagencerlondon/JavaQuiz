package Java.java.quiz;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for(int i=2;i<number;i++)
        {
            if(number%i==0){
                System.out.println(number +" is not a prime number"); isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(number + " is a prime number.");
        }

    }
}


