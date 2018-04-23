package com.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Factorisator fac = new Factorisator();
        Main main = new Main();
        main.Start();
    }

    private void Start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to factorise: ");
        int number = Integer.valueOf(scan.nextLine());
        if(number < 2 || number > Short.MAX_VALUE){
            System.out.println(-1);
            System.exit(900);
        }else{
            Factorisator factor = new Factorisator();
            ArrayList<Short> factors = factor.factorise((short)number);
            String numberFactorised = "";
            for(Short num : factors){
                numberFactorised += num.toString() + " + ";
            }
            numberFactorised = numberFactorised.substring(0, numberFactorised.length() - 3);
            System.out.print(Integer.toString(number) + " = " + numberFactorised);
        }
    }
}
