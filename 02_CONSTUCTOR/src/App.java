// class polos atau danpa constructor
class Polos {
    // atribut objek 
    String dataString;
    int dataInteger;
}

// class mahasiswa dengan constructor
class mahasiswa {
    String nama;
    String NIM;
    String Prodi;
    
    // constructor
    // namanya sama dengan class 
    // tidak memiliki  return value /atau nilai balik
    // medhod yang pertama kali dipanggil saat objek pertama kali di
    mahasiswa(String inputnama,String inputNIM,String inputProdi){
        // mengisi data
        nama = inputnama;
        NIM = inputNIM;
        Prodi = inputProdi;

        // mencetak data 
        System.out.println("nama mahasiswa :"+ nama);
        System.out.println("NIM :"+ NIM);
        System.out.println("Prodi:"+Prodi);
    }

}

public class App {
 public static void main(String[] args) throws Exception {
        // pembuatan objek atau instansiasi objek
        Polos polos_1 = new Polos ();

        // isi atribut 
        polos_1.dataString = "polos";
        polos_1.dataInteger = 10;

        // cetak objek 
        System.out.println (polos_1.dataString);
        System.out.println(polos_1.dataInteger);

        // pembuatan objek mahasiswa
        mahasiswa mhs_1 = new mahasiswa("nabila", "23241056", "PTI");

        // Pembuatan objek 2
        mahasiswa mhs_2 = new mahasiswa("nabila", "23241056", "PTI");






       
    } 
}
 