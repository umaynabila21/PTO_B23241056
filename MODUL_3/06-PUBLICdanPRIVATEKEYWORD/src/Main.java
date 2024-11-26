class Player {
    // data member atau variabel instant
    String nama; // default, ia di akses dari luar class
    public int exp; //public bisa di akses dari oluar class
    private int health; // private, tidak bisa diakses dari luar class

    
    // konstruktor, tampa modifier access
    Player(String nama, int exp, int health){
    this.nama = nama;
    this.exp = exp;
    this.health = health;
    }
    // method, default modifier access
void cetak(){
System.out.println("player:" + this.nama);
System.out.println("Exp "+ this.exp);
System.out.println("Health:" + this.health); 
}

// // method, public modifier access
public void ubahHealth( int healthBaru){
      this.health = healthBaru;
}

// method, private modifier access
private void kurangExp(){
    this.exp -= 1; // exp = exp - 1
}
class Main {
    public static void main(String[] args) {
        // instansiasi objeck 
        Player player1 = new Player("LY", 50,  100);

        // default
        // membaca data
        System.out.println(player1.nama);
        // MENULIS DATA
        player1.nama = "LY";
        System.out.println(player1.nama);

        // public
        // menulis data
        System.out.println(player1.exp);
        player1.exp = 75;
        System.out.println(player1.exp);

        // // PRIVATE
        // // MEMBACA DATA
        // System.out.println(player1.health)
        // // menulis data
        // player1.health = 120;
        // System.out.println(player1.health)
        // membaca data
        // player1.health = 120;
         // System.out.println(player1.health)

         // method default
         player1.cetak(); // method baca

         // method public
         player1.ubahHealth(120 ); // method tulis
         player1.cetak();

         // method private
         // payer1.kurangExp();
         player1.cetak();

        }

    }
}
