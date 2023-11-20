// // This is a class
public class Main{
// Function that which contains an arguments
    public static void main(String[] args) {
//  First player
        Player firstplayer = new Player();
        firstplayer.name ="Cristiano Ronaldo";
        firstplayer.age = 38;
        firstplayer.rank = 1;
        System.out.println(firstplayer.name+" have "+firstplayer.age+" his rank is "+firstplayer.rank);
//        firstplayer.pass();
//        firstplayer.jump();
        firstplayer.shoot();

// Second player
        Player secondplayer = new Player();
        secondplayer.name ="Lionnel Messi";
        secondplayer.age = 36;
        secondplayer.rank = 2;
        System.out.println(secondplayer.name+" have "+secondplayer.age+" his rank is "+secondplayer.rank);
        secondplayer.pass();
//        secondplayer.jump();
//        secondplayer.shoot();
    }
}
