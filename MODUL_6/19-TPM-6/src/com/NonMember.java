package com;

public class NonMember extends Pelanggan {
    private final double POTONGAN = 0.03; // Potongan tetap

    public NonMember(String nama, double totalBelanja) {
        super(nama, totalBelanja);
    }

    private double hitungDiskonPersen() {
        if (totalBelanja > 100_000) {
            return POTONGAN;
        } else {
            return 0.0;
        }
    }

    @Override
    public void tampilkanInfo() {
        double diskonPersen = hitungDiskonPersen();
        double diskonRupiah = totalBelanja * diskonPersen;
        double totalSetelahDiskon = totalBelanja - diskonRupiah;

        System.out.println("Nama Pelanggan          : " + nama);
        System.out.println("Status Kepemilikan      : Non-Member");
        System.out.printf("Total Belanja Sebelum   : Rp%,.2f%n", totalBelanja);
        System.out.println("Diskon (%)             : " + (diskonPersen * 100) + "%");
        System.out.printf("Diskon (Rp)            : Rp%,.2f%n", diskonRupiah);
        System.out.printf("Total Setelah Diskon    : Rp%,.2f%n", totalSetelahDiskon);
    }
}