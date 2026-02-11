package com.example.myapplication;

import java.util.Calendar;
import java.util.Date;

public class Oosoby {
    private String nazwa;
    private Calendar dataUrodzenia;

    public Oosoby(String nazwa, Calendar dataUrodzenia) {
        this.nazwa = nazwa;
        this.dataUrodzenia = dataUrodzenia;
    }

    public Oosoby(String nazwa, int rok, int mc, int dzien) {
        this.nazwa = nazwa;
        dataUrodzenia=Calendar.getInstance();
        dataUrodzenia.set(Calendar.YEAR, rok);
        dataUrodzenia.set(Calendar.MONTH, rok);
        dataUrodzenia.set(Calendar.DAY_OF_MONTH, rok);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Calendar getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Calendar dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return nazwa + ' ' + " dataUrodzenia: " + dataUrodzenia.get(Calendar.YEAR)+" "+dataUrodzenia.get(Calendar.MONTH)+" "+dataUrodzenia.get(Calendar.DAY_OF_MONTH);
    }
}