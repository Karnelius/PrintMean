package com.company;

public class PrintMean {

    public static void main(String[] args) {
// Lösa problemet med heltalsdivision (skriver ut int istället för double


        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1, 1 , 3, 3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1, 2 , 3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2 , 15, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11, 24, 2));
    }
    public static String meanCalc(int a, int b, int c, int d) {
        //Gör en sträng av mean

        double mean = (a+b+c+d) / 4.0;
        String meanString = "Ditt medelvärde är: " + mean;

        return meanString;
    }
}

/*
test test

 */