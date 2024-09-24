import java.util.Scanner;

public class Kalkulator {

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

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = bilangan1 + bilangan2;
                    break;
                case 2:
                    hasil = bilangan1 - bilangan2;
                    break;
                case 3:
                    hasil = bilangan1 * bilangan2;
                    break;
                case 4:
                    if (bilangan2 == 0) {
                        System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                        break;
                    } else {
                        hasil = bilangan1 / bilangan2;
                        break;
                    }
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