package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player players[] = new Player[6];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(random.nextInt(11)+90);
        }

        Player.info();

        while (players[0].getStamina() > 0) {
            players[0].run();
        }

        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
    }
}
