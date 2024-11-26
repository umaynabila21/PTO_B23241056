class Display{
    // variabel objek/ data member
    private String nama;
    static String tipe = "Display"; // variabel static milik class

    // constructor
    Display(String nama){
        this.nama = nama;
    }
        // method cetak
        void cetak(){
            System.out.println("Display name : " + this.nama);
        }
            // method setter
            void setTipe(String tipeInput){
            tipe = tipeInput; // cara 1
            this.tipe = tipeInput; // cara 2
            Display.tipe = tipeInput; // cara 3


        }
    }


public class App {

    public static void main(String[] args) {
        // instansiasi objek
        Display display1 = new Display("monitor");
        display1.cetak();
        Display display2 = new Display("smartphone");
        display2.cetak();

        // menampilkan isi dari variabel static
        System.out.println("\nmenampilkan static varibel");
        System.out.println("objek1 : " + display1.tipe);
        System.out.println("objek2 : " + display2.tipe);
        System.out.println("objek2 : " + Display.tipe);

        // menulis ulang isi variabel static
        // display1.tipe = "Tampilan";
        // display1.tipe = "Tampilan";
        Display.tipe = "Tampilan";

        // method setter
        display1.setTipe("Spanduk");

        // menampilkan isi dari variabel static
        System.out.println("\nmenampilkan static varibel");
        System.out.println("objek1 : " + display1.tipe);
        System.out.println("objek2 : " + display2.tipe);
        System.out.println("objek2 : " + Display.tipe);

        }
    
}