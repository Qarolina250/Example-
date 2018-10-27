package com.company;

public class Zadanie3 {
    public static void main (String[] args){
    String[] tablica = {"Sylwia", "Ola", "Monika"};
    int sum = 0;

    for (int i = 0; i <tablica.length; i++){
        System.out.println(tablica[i]);
        //System.out.println(tablica.length); //to jest cecha tablicy
        System.out.println(tablica[i].length()); //odnosi sie konkretnie do elementu, to jest cecha stringa
        sum += tablica[i].length(); //to samo co sum = sum + tablica[i].lenght();
        System.out.println(sum);
    }

}}
