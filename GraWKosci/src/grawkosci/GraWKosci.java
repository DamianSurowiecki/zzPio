package grawkosci;

import java.util.Random;

public class GraWKosci {

    public static void main(String[] args) {
        Random random = new Random();
        Player player = new Player();
        int var, guess;
        do {
            var = random.nextInt(6) + 1;
            System.out.println("Wylosowano: " + var);
            guess = player.guess();
            System.out.println("Wymyślona: " + guess);

            if (var != guess) {
                System.out.println("Pudło! Spróbuj jeszcze raz!");
            } else {
                System.out.println("Brawo!");
            }
        } while (var != guess);
    }
}
