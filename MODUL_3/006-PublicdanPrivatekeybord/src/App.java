class Player {
    // data memeber atau Variabel instant
    String nama; // default,bisa diakses dari luar class 
    public int exp; // public, bisa diakses dari luar class
    private int health; // private,tidak diakses dari luar kelas

    // konstruktor, dampa modifien   access 
    Player (String nama,int exp,int health){
        this.nama = nama;
        this.exp = exp; 
        this.health = health;
    }
    // method defauld modifier access
    void cetak(){
        kurangEXP();
        System.out.println("Player : " + this.nama);
        System.out.println("EXP : " + this.exp);
        System.out.println("Health : " + this.health);
    }
    // method,public modifier access
    public void ubahHealth(int healthBaru){
        this.health = healthBaru;
    }
    //method,private modifier access
    private void kurangEXP(){
        this.exp -= 1; // exp = exp - 1
    }
    public class App {}
     public static void main(String[] args) throws Exception {  
      // instansisas objek
        Player Player1 = new Player ("mustiati", 50, 100);

        // default
        // membaca data 
        System.out.println(Player1.nama);
        // menulis data
        Player1.nama = "tya";
        System.out.println(Player1.nama);
        
      //  public 
      // membaca data 
      System.out.println(Player1.exp);
      Player1.exp = 75;
      System.out.println(Player1.exp);

      // // private 
      // // membaca data 
      // // System.out.println("Health.health);
      // // menulis data 
      // // Player1.health = 120;
      // // System.out.println("Health.health);

      // method public 
      Player1.ubahHealth(125); //method tulis
      Player1.cetak();
      
    }
}

