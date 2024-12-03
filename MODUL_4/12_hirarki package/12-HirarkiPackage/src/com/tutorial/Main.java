package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;

class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Kim Taehyung");
        player1.cetak();

        Console.log("Menampilkan Data Console");
        Console.log("Player Name : " + player1.getName());

        log("Menggunakan Static Method log");
        log(player1.getName());
    }
}