class BangunDatar {
    private double panjang;
    private double lebar;

    // Konstruktor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // 1. Method Tanpa Return dan Tanpa Parameter
    public void cetakLuasKeliling() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    // 2. Method dengan Parameter dan Tanpa Return
    public void setDimensi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // 3. Method dengan Return dan Tanpa Parameter
    public double hitungLuas() {
        return panjang * lebar;
    }

    // 4. Method dengan Parameter dan Return
    public double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    // Method untuk menghitung keliling (sudah ada di kode sebelumnya)
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk mengatur panjang (sudah ada di kode sebelumnya)
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Method untuk mengatur lebar (sudah ada di kode sebelumnya)
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Method untuk mencetak hasil (sudah ada di kode sebelumnya)
    public void cetakHasil() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}

     class Main {
    public static void main(String[] args) {
        BangunDatar bangun = new BangunDatar(10, 5);

        System.out.println("Hasil Awal:");
        bangun.cetakLuasKeliling(); // Method 1

        bangun.setDimensi(15, 8); // Method 2

        System.out.println("\nHasil Setelah Diubah:");
        bangun.cetakHasil(); 

        double luas = bangun.hitungLuas(); // Method 3
        System.out.println("\nLuas: " + luas);

        double keliling = bangun.hitungKeliling(20, 10); // Method 4
        System.out.println("Keliling: " + keliling);
    }
}