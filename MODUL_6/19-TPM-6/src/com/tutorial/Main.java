package com.tutorial;

import com.Pelanggan;
import com.Member;
import com.NonMember;

public class Main {
    public static void main(String[] args) {
        Member pelanggan1 = new Member("Lusi", 600_000);
        Member pelanggan2 = new Member("Jamet", 300_000);
        NonMember pelanggan3 = new NonMember("Bima", 150_000);
        NonMember pelanggan4 = new NonMember("Erna", 80_000);

        pelanggan1.tampilkanInfo();
        System.out.println();
        pelanggan2.tampilkanInfo();
        System.out.println();
        pelanggan3.tampilkanInfo();
        System.out.println();
        pelanggan4.tampilkanInfo();
    }
}