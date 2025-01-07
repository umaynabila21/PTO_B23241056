package com;

public class Pelanggan {
    protected String nama;
    protected double totalBelanja;

    public Pelanggan(String nama, double totalBelanja) {
        this.nama = nama;
        this.totalBelanja = totalBelanja;
    }

    public void tampilkanInfo() {
        // Akan diimplementasikan di subclass
    }
}