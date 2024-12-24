package com.tutorial;

import com.Lingkaran;
import com.Persegi;
import com.PersegiPanjang;
import com.Segitiga;

public class Main {
    public static void main(String[] args) {
        // Persegi
        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(6);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        // Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(2, 8);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        // Segitiga
        Segitiga segitiga = new Segitiga(4, 10);
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}