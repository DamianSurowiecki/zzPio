package grawkosci;

import java.util.Random;

public class Player {

    private Random random = new Random();

    public int guess() {
        return random.nextInt(6) + 1;
    }

}
