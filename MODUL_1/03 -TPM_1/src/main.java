 import java.util.Scanner;

class Kalkulator {
    private double angka1;
    private double angka2;
    
    // Konstruktor 
    public Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    // Metode untuk operasi aritmatika
    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public double bagi() {
        if (angka2 == 0) {
            throw new ArithmeticException("Tidak dapat dibagi dengan nol");
        } else {
            return angka1 / angka2;
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Silahkan masukan pilihan anda:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");

            System.out.print("Masukan pilihan: ");
            int pilihan = input.nextInt();

            if (pilihan == 5) {
                lanjut = false;
                System.out.println("Terima kasih!");
                break;
            }

            System.out.print("Masukan bilangan 1: ");
            double bilangan1 = input.nextDouble();

            System.out.print("Masukan bilangan 2: ");
            double bilangan2 = input.nextDouble();
            
            Kalkulator kalkulator = new Kalkulator(bilangan1, bilangan2);
            Kalkulator kalkulator1 = new Kalkulator(bilangan1, bilangan2);

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = kalkulator.tambah();
                    break;
                case 2:
                    hasil = kalkulator.kurang();
                    break;
                case 3:
                    hasil = kalkulator.kali();
                    break;
                case 4:
                    try {
                        hasil = kalkulator.bagi();
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                        break;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.println("Hasil: " + hasil);
            }

            System.out.println("Apakah ingin lanjut? (y/n)");
            String lanjutInput = input.next();
            lanjut = lanjutInput.equalsIgnoreCase("y");
        }

        input.close();
    }
}
