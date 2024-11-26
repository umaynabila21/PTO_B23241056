class Player {
    // Data member atau variabel instant
    String nama; // default, bisa diakses dari luar class
    public int exp; // public, bisa diaksess dari luar class
    private int health; // private, tidak bisa diakses di luar class

    // kontruktor, tanpa modifier access
    Player(String nama, int exp, int health) {
        this.nama = nama;
        this.exp = exp;
        this.health = health;

    }
}


public class App {

    public static void main(String[] args) {
        // instansisasi objek 
        Player player1 = new Player()
    }
}