package com.Day6;
import java.util.Scanner;
public class PrimeNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            sc.close();

            boolean isPrime = true; //initialise true and use to store whether the number is prime or not
            if(num <= 1) {
                isPrime = false;
            } else {
                for(int i = 2; i <= Math.sqrt(num); i++) {
                    if(num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is not a Prime Number.");
            }
        }
}
