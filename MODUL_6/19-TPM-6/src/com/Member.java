package com;

public class Member extends Pelanggan {
    private final double POTONGAN_TIER_1 = 0.10; // Belanja > 500.000
    private final double POTONGAN_TIER_2 = 0.05; // 100.000 <= Belanja <= 499.999
    private final double POTONGAN_TIER_3 = 0.03; // Belanja < 100.000

    public Member(String nama, double totalBelanja) {
        super(nama, totalBelanja);
    }

    private double hitungDiskonPersen() {
        if (totalBelanja > 500_000) {
            return POTONGAN_TIER_1;
        } else if (totalBelanja >= 100_000 && totalBelanja <= 499_999) {
            return POTONGAN_TIER_2;
        } else {
            return POTONGAN_TIER_3;
        }
    }

    @Override
    public void tampilkanInfo() {
        double diskonPersen = hitungDiskonPersen();
        double diskonRupiah = totalBelanja * diskonPersen;
        double totalSetelahDiskon = totalBelanja - diskonRupiah;

        System.out.println("Nama Pelanggan          : " + nama);
        System.out.println("Status Kepemilikan      : Member");
        System.out.printf("Total Belanja Sebelum   : Rp%,.2f%n", totalBelanja);
        System.out.println("Diskon (%)             : " + (diskonPersen * 100) + "%");
        System.out.printf("Diskon (Rp)            : Rp%,.2f%n", diskonRupiah);
        System.out.printf("Total Setelah Diskon    : Rp%,.2f%n", totalSetelahDiskon);
    }
}