class GajiBersih {
    // Variabel instance (semua private)
    private int gajiPokok;
    private int tunjangan;
    private double pajakPersen;

    // Konstruktor
    public GajiBersih() {
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.pajakPersen = 0;
    }

    // Konstruktor dengan parameter (menggunakan setter untuk validasi)
    public GajiBersih(int gajiPokok, int tunjangan, double pajakPersen) {
        setGajiPokok(gajiPokok);
        setTunjangan(tunjangan);
        setPajakPersen(pajakPersen);
    }

    // Getter untuk gaji pokok
    public int getGajiPokok() {
        return this.gajiPokok;
    }

    // Setter untuk gaji pokok
    public void setGajiPokok(int gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Gaji pokok tidak boleh negatif!");
            return;
        }
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return this.tunjangan;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        if (tunjangan < 0) {
            System.out.println("Tunjangan tidak boleh negatif!");
            return;
        }
        this.tunjangan = tunjangan;
    }

    // Getter untuk pajakPersen
    public double getPajakPersen() {
        return this.pajakPersen;
    }

    // Setter untuk pajakPersen
    public void setPajakPersen(double pajakPersen) {
        if (pajakPersen < 0 || pajakPersen > 100) {
            System.out.println("Pajak harus antara 0% dan 100%!");
            return;
        }
        this.pajakPersen = pajakPersen;
    }

    // Method untuk menghitung dan menampilkan gaji bersih
    public void cetakGajiBersih() {
        if (gajiPokok == 0 || tunjangan == 0 || pajakPersen == 0) {
            System.out.println("Gaji pokok, tunjangan, dan pajak harus diisi terlebih dahulu!");
            return;
        }

        double gajiKotor = gajiPokok + tunjangan;
        double pajakRupiah = (pajakPersen / 100) * gajiKotor;
        double gajiBersih = gajiKotor - pajakRupiah;

        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Pajak (" + pajakPersen + "%): " + pajakRupiah);
        System.out.println("Gaji Bersih: " + gajiBersih);
        System.out.println("--------------------\n");
    }

    public static void main(String[] args) {
        // Menggunakan konstruktor dengan parameter
        GajiBersih karyawan1 = new GajiBersih(5000000, 1000000, 10);
        karyawan1.cetakGajiBersih();

        // Menggunakan konstruktor tanpa parameter
        GajiBersih karyawan2 = new GajiBersih();
        karyawan2.setGajiPokok(6000000);
        karyawan2.setTunjangan(1500000);
        karyawan2.setPajakPersen(15);
        karyawan2.cetakGajiBersih();
    }
}