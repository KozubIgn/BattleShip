package app;

import java.util.Random;

public class AIPlayer extends Player {

    public int[] createShoot() {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Random random = new Random();
        int randomNumberX = random.nextInt(numbers.length);
        int randomNumberY = random.nextInt(numbers.length);

        String result = String.valueOf(randomNumberX) + String.valueOf(randomNumberY);

        return convertCoordniates(result); // Scanner from user
    }// Random from PC

}