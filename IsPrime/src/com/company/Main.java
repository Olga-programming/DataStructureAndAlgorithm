package com.company;

public class Main {

    public static void primeNumber(int limit){
        for(int number = 2; number <= limit; number++){
            if(isPrime(number)){
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number){
        for( int factor = 2; factor < number; factor++){
            if(number%factor == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primeNumber(20);
        primeNumber(15);
    }
}
