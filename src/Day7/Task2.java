package Day7;
import java.util.Random;
public class Task2 {
    public static void main (String[] args) {
    Random random = new Random();
    Player player1 = new Player(random.nextInt(99) + 1);
    Player player2 = new Player(random.nextInt(99) + 1);
    Player player3 = new Player(random.nextInt(99) + 1);
    Player player4 = new Player(random.nextInt(99) + 1);
    Player player5 = new Player(random.nextInt(99) + 1);

    System.out.println(player1.getStamina() + " " + player2.getStamina() + " " + player3.getStamina() + " " +
            player4.getStamina() + " " + player5.getStamina());
    player1.run();
    System.out.println(player1.getStamina());
    Player.getCountPlayers();
    Player.info();
    }
}


