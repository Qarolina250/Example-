package com.company;

public class Dog {


    public Dog() { //konstruktor domyślny
        this.liczba_lap =4;
    }
    public Dog(String rasa, int lata, String imie) { //konstruktor,
        this();
        this.rasa = rasa;
        this.lata = lata;
        this.imie = imie;
        this.liczba_lap =5;
    }

    public String getRasa() { //zwykla metoda, ktora zwraca
        return rasa;
    }

    public void setRasa(String rasa) {//zwykla metoda ktora stawia nowa wartosc dla parametru
        this.rasa = rasa;
    }

    private String rasa;
    int lata;
    String imie;
    int liczba_lap =4;

    public void szczekanie(){
        System.out.println("how how");
    }
    public void przedstawsie(){
        System.out.println(imie);
    }
}
