package com.example.pt02prak2072028collection.model;

public class DataMahasiswa {
    private String nrp;
    private String nama;
    private int nilaiIPA;
    private int nilaiIPS;

    public DataMahasiswa(String nrp, String nama, int nilaiIPA, int nilaiIPS) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilaiIPA = nilaiIPA;
        this.nilaiIPS = nilaiIPS;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilaiIPA() {
        return nilaiIPA;
    }

    public void setNilaiIPA(int nilaiIPA) {
        this.nilaiIPA = nilaiIPA;
    }

    public int getNilaiIPS() {
        return nilaiIPS;
    }

    public void setNilaiIPS(int nilaiIPS) {
        this.nilaiIPS = nilaiIPS;
    }
}
