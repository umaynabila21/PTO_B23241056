// class polos atau tanpa constructor
class Polos{
    // atribut objek
    String dataString;
    int dataInteger;
}


// class dengan constructor
class Mahasiswa{
    // atribut 
    String nama;
    String NIM;
    String prodi;

    //  constructor
    // namanya sama dengan nama class
    // tidak memiliki return value/nilai baik
    // method yang pertama kali di panggil saat objek pertama kali di buat
    Mahasiswa(String inputnama,String inputNIM, String inputProdi){
        nama = inputnama;
        NIM = inputNIM;
        prodi = inputProdi;

        System.out.println("nama Mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + prodi); 
    }

}

public class App {   
    public static void main(String[] args) throws Exception {
        // pembuatan objek atau instansiasi objek
        Polos polos_1 = new Polos();

        // isi atribut 
        polos_1.dataString = "polos";
        polos_1.dataInteger = 10;

        // cetak objek
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataString);
        
        // pembuatan objek mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("ardila","23241054","pti");
        Mahasiswa mhs_2 = new Mahasiswa("ardika","23241087","pti");


    }
}
