class Data{
    // data menbar atau variabel instant
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // construktor, modifier public
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
    }

    //Getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //Setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

    // cetak
    void cetak(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
}
public class Main {
    public static void main(String[] args) {
        // instansiasi objek
        Data  objek = new Data();

        // membaca dan menulis menggunakan public
        // tulis
        objek.intPublic = 5;
        //baca
        System.out.println("Public : " + objek.intPublic);

        // membaca menggunakan Getter
        int angka = objek.getIntPrivate();
        objek.cetak();
    }
}