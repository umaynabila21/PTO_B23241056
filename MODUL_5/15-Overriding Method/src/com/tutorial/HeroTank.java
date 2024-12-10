package com.tutorial;

// subclass
public class HeroTank extends Hero {
    // overriding
    double defencepower;

    //overriding method
    void cetak(){
        System.out.println("Hero Dari Subclass");
        System.out.println("Hero Tank");
        System.out.println("Hero : " + this.nama);
        System.out.println("Defence Power : " + this.defencepower);
    }
}
