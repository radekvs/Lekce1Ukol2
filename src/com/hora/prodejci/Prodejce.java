package com.hora.prodejci;

import java.util.Date;

public class Prodejce {
        private String jmeno, prijmeni;
        private Date datNarozeni;
        private int sumSmluv;
        private int prodanoCelkem;
        private String sidlo;
        private  String spz;
        private double spotreba;
        private String ip;


    public Prodejce(String jmeno, String prijmeni, Date datNarozeni, int sumSmluv, int prodanoCelkem, String sidlo, String spz, double spotreba, String ip) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datNarozeni = datNarozeni;
        this.sumSmluv = sumSmluv;
        this.prodanoCelkem = prodanoCelkem;
        this.sidlo = sidlo;
        this.spz = spz;
        this.spotreba = spotreba;
        this.ip = ip;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Date getDatNarozeni() {
        return datNarozeni;
    }

    public void setDatNarozeni(Date datNarozeni) {
        this.datNarozeni = datNarozeni;
    }

    public int getSumSmluv() {
        return sumSmluv;
    }

    public void setSumSmluv(int sumSmluv) {
        this.sumSmluv = sumSmluv;
    }

    public int getProdanoCelkem() {
        return prodanoCelkem;
    }

    public void setProdanoCelkem(int prodanoCelkem) {
        this.prodanoCelkem = prodanoCelkem;
    }

    public String getSidlo() {
        return sidlo;
    }

    public void setSidlo(String sidlo) {
        this.sidlo = sidlo;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public double getSpotreba() {
        return spotreba;
    }

    public void setSpotreba(double spotreba) {
        this.spotreba = spotreba;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

