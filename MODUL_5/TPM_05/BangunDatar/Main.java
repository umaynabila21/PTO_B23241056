package BangunDatar;

class BangunDatar{
    public float luas(){
        return 0; // Implementasi standar, harus ditimpa oleh subclass
    } 
    public float keliling(){
        return 0; // Implementasi standar, harus ditimpa oleh subclass
    }
} 

class Persegi extends BangunDatar{
    private float sisi;

    public Persegi(float sisi){
        this.sisi = (sisi >= 0) ? sisi : 0; // menangani sisi negatif
    }

    public float luas(){
        return sisi*sisi;
    }
    public float keliling(){
        return 4*sisi;
    }
}


class Lingkaran extends BangunDatar{
    private float r;

    public Lingkaran(float r){
        this.r = (r >= 0)? r : 0; // menangani jari-jari negatif
    }

    public float luas(){
        return(float) (Math.PI * r * r);
    }

    public float keliling(){
        return(float) (2 * Math.PI * r);
    }
}


class PersegiPanjang extends BangunDatar{
    private float Panjang;
    private float Lebar;

    public PersegiPanjang(float Panjang, float Lebar){
        this.Panjang = (Panjang >= 0) ? Panjang : 0; // Menangani Panjang Negatif
        this.Lebar = (Lebar >= 0) ? Lebar : 0; // Menangani Lebar Negatif
    }

    public float luas(){
        return Panjang * Lebar;
    }

    public float keliling(){
        return 2 * (Panjang + Lebar);
    }
}

class Segitiga extends BangunDatar{
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi){
        this.alas = (alas >= 0) ? alas : 0; // menangani alas negatif
        this.tinggi = (tinggi >= 0) ? tinggi : 0; // menangani tinggi negatif
    }

    public float luas(){
        return 0.5f * alas * tinggi;
    }

    // Perhitungan keliling membutuhkan panjang ketiga sisi. Contoh ini mengasumsikan 
    //segitiga sama kaki untuk penyederhanaan. Solusi yang lebih umum membutuhkan parameter tambahan.
    public float keliling(){
        // Teorema Pythagoras untuk segitiga sama kaki
        float sisiMiring = (float) Math.sqrt(alas * alas / 4 + tinggi * tinggi); 
        return alas + 2 * sisiMiring;
    }
}

public class Main {
    public static void main(String[] args) {

        // membuat program (baru)
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(2);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Segitiga segitiga = new Segitiga(6, 8);



        // Keluran (hasil)

        System.out.println("Luas Persegi: " + persegi.luas());
            System.out.println("Keliling Persegi: " + persegi.keliling());
            System.out.println("Luas Lingkaran: " + lingkaran.luas());
            System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
            System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
            System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
            System.out.println("Luas Segitiga: " + segitiga.luas());
            System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
    
}
