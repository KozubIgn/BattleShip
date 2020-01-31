package app;

public class HumanPlayer extends Player {

    public int[] createShoot() {

        System.out.print(" Enter LETTER(x) coordinate to shoot: ");
        UserGlobalInput userInput = new UserGlobalInput();

        String x = userInput.getStringInput().toUpperCase();

        String lettersCoordinates = "ABCDEFGHIJ";
        int coordinatesLetterX = lettersCoordinates.indexOf(x);
        System.out.println("X " + coordinatesLetterX);

        System.out.print(" Enter DIGIT(y) coordinate to shoot: ");
        int y = userInput.getIntInput();

        int coordinatesDigitY = y - 1;
        System.out.println("Y " + coordinatesDigitY);

        int[] coordinates = new int[2];
        coordinates[0] = coordinatesLetterX;
        coordinates[1] = coordinatesDigitY;

        return coordinates; // Scanner from user
    }

}