package com.company;

public class Main {

    //zadanie 1
    public static int średnia(int[] tablica){
        int średnia = 0;
        if (tablica.length > 0) {
            int suma = 0;
            for (int i = 0; i < tablica.length; i++) {
                suma += tablica[i];
            }
            średnia = suma / tablica.length;
            System.out.println("Średnia arytmetyczna ma wartość " + średnia);
            return średnia;
        }
        return 0;
    }

    //zadanie 2
    public static int sumaKwadratów(int[] n){
        int suma = 0;
        for (int i = 0; i < n.length; i++) {
            suma += n[i] * n[i];
        }
        return suma;
    }

    //zadanie 3
    static Integer find(int[] tablica) {
        if (tablica == null || tablica.length == 0) {
            System.out.println("brak danych");
            return null;
        }
        int liczba = 0;
        for (int k = 0; k < tablica.length; k++) {
            if (tablica[k + 1] - tablica[k] > 1) {
                liczba = tablica[k + 1];
                break;
            }
        }
        if(liczba == 0){
            return null;
        }

        return liczba;
    }


    //zadanie 4
    public static int poKolei( int[] tablica) {
        int wynik = 0;
        for(int i = 1; i < tablica.length; i++) {
            wynik += (tablica[i] - tablica[i-1]) - 1;
        }
        return wynik;
    }

    //zadanie 5
    public static int najwyższyWynik(int[] tablica) {
        int max = tablica[0]*tablica[1];

        for(int i=0; i<tablica.length-1; i++){
            if(max < tablica[i]*tablica[i+1])
                max = tablica[i]*tablica[i+1];
        }

        return max;
    }


    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 6, 7, 8, 120};
        System.out.println("srednia : " + średnia(v));

        System.out.println("sumaKwadratow : " + sumaKwadratów(v));

        System.out.println("znajdz : " + find(v));

        int[] v1 = {4, 8, 6};
        System.out.println("poKolei : " + poKolei(v));


        int[] v2 = {1, 2, 3};
        System.out.println("najwyzszyWynik : " + najwyższyWynik(v2));


    }
}

