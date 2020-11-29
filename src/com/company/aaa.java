package com.company;

public class aaa {

    public double średnia ( int[] tablica){
        double średnia = 0;
        int n = tablica.length;
        if (n > 0) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += tablica[i];
            }
            średnia = suma / n;
            System.out.println("Średnia arytmetyczna ma wartość " + średnia);
            return suma;
        }
        return 0;
    }
}
