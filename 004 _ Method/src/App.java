class Mahasiswa {
    // data Member atau ciri 
    String Nama;
    String NIM;

    // constructor
    Mahasiswa (String Nama,String NIM) {
        this.Nama = Nama;
        this.NIM = NIM;

    }

    // method tanpa return dan dampa parameter 
    void cetak (){
        System.out.println("Nama :" + this.Nama);
        System.out.println("NIM :" + this.NIM);

    }

    //method dengan parameter dan dampa return
    void setNama (String Nama,String NIM){
        this .Nama =Nama;
        this.NIM = NIM;
    }
    // method dengsm return dan tampa parameter
    String getNama (){
     return this.Nama; 
    }

    String getNIM (){
        return this.NIM;
    }

    // method dengan parameter dan return
    String sayHi(String pesan){
        return "Hi.."+ this.Nama+pesan;
    }
}

public class App {
    public static void main (String [] args )throws Exception {
        // membuat objek
        Mahasiswa mhs_1 = new Mahasiswa("nabila", "23241056");

        // memanggil method tanpa parameter dan return
        mhs_1.cetak();

        // memanggil method dengan paramete tanpa return
        mhs_1.setNama("nabila", "12345678");
        mhs_1.cetak();

        // memanggil method dengan return tanpa parameter 
        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());

        // memanggil method dengan paramete dan return
        String pesan = mhs_1.sayHi(" Sukses belajar OOP ");
        System.out.println(pesan);
       

    }
  
}



 


 