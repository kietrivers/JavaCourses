package Day7;

public class Player {

    private int stamina;
    private final int MAX_STAMINA = 100; //
    private final int MIN_STAMINA = 0;  //
    private static int countPlayers = 0;

    public static void getCountPlayers() {
        System.out.println("Count: " + countPlayers);
    }

    public int getStamina() {
        return stamina;
    }
    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers += 1;
        }
    }

    public void run() {
        if (stamina > 0){
            stamina--;
        }
        else {
            return;
        }
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers == 6) {
            System.out.println("No free places");
        }
        else {
            System.out.println("There is(are) " + (6 - countPlayers) + " free place(s)");
        }
    }
}





