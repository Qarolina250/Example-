package com.company;
import java.util.Scanner;

public class Zadanie2 {
    public static void main (String[] args){
        System.out.println("Podaj 1 liczbę");
        Scanner scanner = new Scanner(System.in);
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj  2 liczbę");
        int liczba2 = scanner.nextInt();

        if (liczba2 !=0){
            double liczba3=(double)liczba1/liczba2;
            System.out.println("Wynika dzielenia to " + liczba3);
        } else{
            System.out.println("Nie dziel przez 0");
        }
    }





}
