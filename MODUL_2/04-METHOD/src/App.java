class Mahasiswa {
    //data member atau ciri 
    String Nama;
    String NIM;

    // construktor
    Mahasiswa(String Nama, String NIM) {
        this.Nama = Nama;
        this.NIM = NIM;

    }
    
    // method tampa return dan tanpa parameter
    void cetak(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method dengan parameter dan tanpa return 
    void setNama(String Nama){
        this.Nama = Nama;
    }

    // method dengan return dan tanpa parameter 
    String getNama(){
        return this.Nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // method dengan parameter dan return 
    String sayHi(String pesan){
        return "Hi.." + this.Nama + pesan;
    }
}

public class App {
 public static void main(String[] args) throws Exception {

    // MEMBUAT OBJEK
    Mahasiswa mhs_1 = new Mahasiswa("bila", "23241056");

    // memanggil method dengan parameter dan return 
    mhs_1.cetak();


    // memanggil method dengan parameter tanpa return
    mhs_1.setNama("LY");
    mhs_1.cetak();
                                    
    System.out.println(mhs_1.getNama());
    System.out.println(mhs_1.getNIM());

    
    // memanggil method dengan parameter dan return 
    String pesan = mhs_1.sayHi("sukses belajar oop");
    System.out.println(pesan);


 }
}
