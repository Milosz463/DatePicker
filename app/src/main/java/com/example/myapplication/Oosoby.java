package com.example.myapplication;

import java.util.Date;

public class Oosoby {
    private String nazwa;
    private Date dataUrodzenia;



    public Oosoby(Date dataUrodzenia, String nazwa) {
        this.dataUrodzenia = dataUrodzenia;
        this.nazwa = nazwa;

    }
    public Oosoby(String nazwa) {
        this.nazwa = nazwa;
        dataUrodzenia = new Date();

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwa='" + nazwa + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';

    }
}
