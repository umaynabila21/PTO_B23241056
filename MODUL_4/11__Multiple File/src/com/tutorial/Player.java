package com.tutorial;

class Player{
    // variabel
    private String nama;

    // konstruktor
    Player(String nama){
        this.nama = nama;
    }

    // Method cetak
    void cetak(){
        System.out.println("Nama : " + this.nama);
    }
}