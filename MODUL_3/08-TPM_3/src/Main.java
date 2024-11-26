// Kelas GajiBersih
class GajiBersih {
    private int gajiPokok;
    private int tunjangan;
    private double pajakPersen;

    // Getter dan Setter untuk gaji pokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Gaji pokok tidak boleh negatif!");
            return;
        }
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        if (tunjangan < 0) {
            System.out.println("Tunjangan tidak boleh negatif!");
            return;
        }
        this.tunjangan = tunjangan;
    }

    // Getter dan Setter untuk pajakPersen
    public double getPajakPersen() {
        return pajakPersen;
    }

    public void setPajakPersen(double pajakPersen) {
        if (pajakPersen < 0 || pajakPersen > 100) {
            System.out.println("Pajak harus antara 0% dan 100%!");
            return;
        }
        this.pajakPersen = pajakPersen;
    }

    // Method untuk menghitung gaji kotor
    public double hitungGajiKotor() {
        return gajiPokok + tunjangan;
    }

    // Method untuk menghitung pajak
    public double hitungPajak() {
        return (pajakPersen / 100) * hitungGajiKotor();
    }

    // Method untuk menghitung gaji bersih
    public double hitungGajiBersih() {
        return hitungGajiKotor() - hitungPajak();
    }

    // Method untuk menampilkan rincian gaji
    public void cetakRincianGaji() {
        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Gaji Kotor: " + hitungGajiKotor());
        System.out.println("Pajak (" + pajakPersen + "%): " + hitungPajak());
        System.out.println("Gaji Bersih: " + hitungGajiBersih());
        System.out.println("--------------------\n");
    }
}

// Class Main (di luar kelas GajiBersih)
public class Main {
    public static void main(String[] args) {
        GajiBersih karyawan = new GajiBersih();
        karyawan.setGajiPokok(5000000);
        karyawan.setTunjangan(1000000);
        karyawan.setPajakPersen(10);
        karyawan.cetakRincianGaji();
    }
} 