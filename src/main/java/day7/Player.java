package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player (int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run () {
        stamina -= 1;
        if(stamina == 0) {
            System.out.println("Игроку нужен отдых. Он уходит с поля.");
            countPlayers--;
        } else {
            System.out.println("Игрок бежит");
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест");
        }
        else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}
