package com.app;

import java.util.ArrayList;

public class Factorisator {

    private static ArrayList<Short> Primes;

    public Factorisator() {
        Primes = new ArrayList<>();
        fillPrimes();
    }

    public ArrayList<Short> factorise(short number){
        ArrayList<Short> factors = new ArrayList<>();
        short numLeftover = number;
        for(int i =Primes.size()-1; i>=0;i--){
            if(Primes.get(i) <= numLeftover){
                factors.add(Primes.get(i));
                numLeftover-=Primes.get(i);
            }
        }
        return factors;
    }

    public static void fillPrimes() {
        int max = Short.MAX_VALUE;
        int halfOfPrimes = max/2;
        Primes.add((short)1);
        Primes.add((short)2);

        boolean potentialPrime;
        for (short i = 3; i < max; i++) {
            potentialPrime = true;
            for (int j = 2; j < (i / 2 < halfOfPrimes ? i / 2 : halfOfPrimes) + 1; j++) {
                if(j>2 && j%2 == 0 || j>3 && j%3 == 0 || j>5 && j%5 == 0){
                    continue;
                }
                if (i % j == 0) {
                    potentialPrime = false;
                    break;
                }
            }
            if (potentialPrime) {
                Primes.add(i);
            }
        }
    }

    public void printPrimes(){
        for(short s : Primes){
            System.out.println(s);
        }
    }
}
