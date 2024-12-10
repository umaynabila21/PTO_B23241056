package com.tutorial;

public class Player {
    // atribut
    private String name;
    private static int jumlahPlayer;

    // constructor
    // opsi pertama untuk membuat objek
    Player (String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    // overloading consturctor
    // opsi 2 untuk membuat objek
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + Player.jumlahPlayer;
    }

    // method
    void cetak(){
        System.out.println("Name : " + this.name);
    }
}
