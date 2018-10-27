package com.company;
import java.util.Scanner;
public class GraKostki {

    int liczba_kostek;
    int[] kostka;


    public void rzuc_kostka(){
        for (int i =0; i<liczba_kostek; i++ ){
            kostka[i]=((int)( 6 * Math.random() ) + 1);
        }
    }
    public void wynik(){
        StringBuilder wynik = new StringBuilder("{");
        for (int i = 0; i <kostka.length; i++){
            wynik.append(kostka[i]).append(",");
        }
        wynik.append("}");
        System.out.println(wynik);
    }

    public GraKostki(int liczba_kostek) {
        this.liczba_kostek = liczba_kostek;
        this.kostka = new int[liczba_kostek];
    }
}




