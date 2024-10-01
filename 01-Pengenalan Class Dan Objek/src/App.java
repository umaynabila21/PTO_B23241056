// membuat class sebagai template
class Mahasiswa{

    // membuat ciri-ciri atribut objek
    String nama;
    String NIM;
    String prodi;
    Double IPK;
    int umur;
}



public class App {
    public static void main(String[] args) throws Exception {
        
// instasiasi atau membuat objek
Mahasiswa mhs_1 = new Mahasiswa();

// pengisian data objek
mhs_1.nama = "Ardila";
mhs_1.NIM = "23241054";
mhs_1.prodi = "PTi";
mhs_1.umur = 20;

// cetak data
System.out.println("nama : " +  mhs_1.nama);
System.out.println("NIM : " + mhs_1.NIM);
System.out.println("prodi : " + mhs_1.prodi);
System.out.println("IPK : " + mhs_1.IPK);
System.out.println("umur : " + mhs_1.umur);


// instasiasi atau membuat objek
Mahasiswa mhs_2 = new Mahasiswa();

// pengisian data objek
mhs_2.nama = "jennifer";
mhs_2.NIM = "23241054";
mhs_2.prodi = "PTi";
mhs_2.umur = 20;

// cetak data
System.out.println("nama : " +  mhs_2.nama);
System.out.println("NIM : " + mhs_2.NIM);
System.out.println("prodi : " + mhs_2.prodi);
System.out.println("IPK : " + mhs_2.IPK);
System.out.println("umur : " + mhs_2.umur);

    }
}










