package com.company;

public class Main {
    public static void main(String[] args) { //static oznacza wspolne dla wszysktkich obiektow
	// write your code here
        //Dog Pies= new Dog();
        //Pies.lata = 9;
        //Pies.rasa = "York";
        //Pies.imie ="Gucio";
        //Pies.szczekanie();
        //Pies.przedstawsie();

        //Dog Pies = new Dog( "York",9,"Gucio");
        //Pies.przedstawsie();
        //Pies.szczekanie();
        //Pies.liczba_lap =3;
        //System.out.println(Pies.liczba_lap);
        //Pies.getRasa();
        //Pies.setRasa("Buldog");
        //System.out.println(Pies.getRasa());

        //GraKostki gra1= new GraKostki(5);
        //gra1.rzuc_kostka();
        //gra1.wynik();

        Osoba osoba1= new Osoba( "Karolina", "Kaminska", 25, 165, true, Plec.kobieta);
        Osoba osoba2= new Osoba( "Karolina", "Kaminska", 25, 165, true, Plec.kobieta);
        //osoba1.toString();
        //osoba2.toString();
        //System.out.println(osoba1==osoba2);
        System.out.println(osoba1.equals(osoba2));


        //osoba1.przedstawsie();
        //osoba1.toString();
        //System.out.println(osoba1);


    }
}