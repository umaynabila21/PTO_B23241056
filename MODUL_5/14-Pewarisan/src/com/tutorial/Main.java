package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // membuat objek dari superclass
        Hero hero1 = new Hero();
        hero1.name = "Kakashi";
        hero1.cetak();

        // membuat objek dari subclass
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Sasuke";
        hero2.cetak();

        HeroIntell hero3 = new HeroIntell();
        hero3.name = "Neji";
        hero3.cetak();
    }
}
