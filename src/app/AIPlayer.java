package app;

import java.util.Random;

public class AIPlayer extends Player {

    public int[] createShoot() {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Random random = new Random();
        int randomNumberX = random.nextInt(numbers.length);
        System.out.println("X " + randomNumberX);
        int randomNumberY = random.nextInt(numbers.length);
        System.out.println("Y " + randomNumberY);

        int[] coordinates = new int[2];
        coordinates[0] = randomNumberX;
        coordinates[1] = randomNumberY;

        return coordinates;
    }// Random from PC

}