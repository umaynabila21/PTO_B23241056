package com.tutorial;

// import package eksternal
import com.terminal.Console;

// visiniliti default hanya bisa diakses oleh 
// package yang sama
class Player {
    // variabel objek
    private String nama;

    // konstruktor 
    Player(String nama){
        this.nama = nama;
    }

    // method cetak
    void cetak(){
        // System.out.println("Nama : " + this.nama);
        Console.log("Menggunakan Console");
        Console.log("Nama : " + this.nama);
        
    }

    // Method getter 
    String getName(){
        return this.nama;
    }


    
}
