package com.company;

import java.util.Objects;

public class Osoba {

    String imie;
    String nazwisko;
    int wiek;
    float wzrost;
    boolean czy_kobieta;
    Plec plec;

    public void przedstawsie(){
    System.out.println(imie);
    System.out.println(nazwisko);
    }

    public Osoba() {
    }



    public Osoba(String imie, String nazwisko, int wiek, float wzrost, boolean czy_kobieta, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.czy_kobieta = czy_kobieta;
        this.plec =plec;
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", czy_kobieta=" + czy_kobieta +
                ", plec=" + plec +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek &&
                Float.compare(osoba.wzrost, wzrost) == 0 &&
                czy_kobieta == osoba.czy_kobieta &&
                Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko) &&
                plec == osoba.plec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek, wzrost, czy_kobieta, plec);
    }
}
