package com.tutorial;

public class HeroTank extends Hero{
    // atribut baru
    String nama = "Class Hero Tank";

    //overriding method
    void cetak(){
        System.out.println("Ini adalah " + this.nama);
        this.DummyMethod();
    }

    void DummyMethod(){
        System.out.println("Method ini ada di Subclass");
    }
}