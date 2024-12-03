package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Mustiati");
        Player player2 = new Player("Aulia Zaskia");
        Player player3 = new Player("Erna Wati");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Assalamu'alaikum");
    }
    
}
