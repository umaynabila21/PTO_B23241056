import java.util.ArrayList;
class Player {
   // VARIABEL OBJEK
   private String nama;
   private static int numberOfPlayer; // variabel static

   // array variabel
   private static ArrayList<String> namaList = new ArrayList<String>();

   // konstructor
   Player(String nama){
    this.nama = nama;
    Player.numberOfPlayer++;
    Player.namaList.add(this.nama);
   }

   // method static cetak numberOfPlayer
   static void showNumberOfPlayer(){
    System.out.println("NumberOfPlayer : " + Player.numberOfPlayer);
   }

   // method cetak 
   void cetak(){
    System.out.println("player nama : " + this.nama);
   }

   // method static getter
   static ArrayList<String> getName(){
    return Player.namaList;
   }
}


public class App {

    public static void main(String[] args) {
       // membuat objek
       Player player1 = new Player("LY");
       Player player2 = new Player("LYE");
       Player player3 = new Player("LYN");
       Player player4 = new Player("CILL");
       Player player5 = new Player("CILLL");
       
       Player.showNumberOfPlayer();
       player1.cetak();

       // panggil nama array
       System.out.println("Nama : " + Player.getName());


    }
}