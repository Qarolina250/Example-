package com.company;

public class Zadanie {
    public static void main (String[] args){
        int a = 9;
        if (a %2 ==0) {
            System.out.println("podzielna przez 2");
        } else if (a%3 ==0) {
            System.out.println("podzielna przez 3");
        } else
        {
            System.out.println("nie");
        }

        int b = 1;
        switch (b){ //instrukcja wyboru
            case 1: //wzorzec1
                System.out.println("1");
                break;//skoncz prae
            case 2://wzorzec2
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default://defaultowa wartosc
                System.out.println("zadna");
        }


        while (b<8) {
            System.out.println("mniejsze od 8");
            b++;
        }

    }
}
