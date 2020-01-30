package app;

public class HumanPlayer extends Player {

    // public char getChar(){

    // Scanner charScanner = new Scanner(System.in);
    // System.out.println("Input Letter: ");
    // charScanner
    // }

    public int[] createShoot() {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Please enter letter coordinate to shoot: ");
        // String userInputLetter = scanner.nextLine().toUpperCase();
        // String lettersCoordinates = "ABCDEFGHIJ";
        // System.out.print("Please enter digit coordinate to shoot: ");
        // int userInputDigit = scanner.nextInt();

        // userInput.getIntInput();
        System.out.print(" Enter LETTER(x) coordinate to shoot: ");
        UserGlobalInput userInput = new UserGlobalInput();

        String x = userInput.getStringInput().toUpperCase();
        // userInput.scanerClose();

        String lettersCoordinates = "ABCDEFGHIJ";
        int coordinatesLetterX = lettersCoordinates.indexOf(x);
        System.out.println("X " + coordinatesLetterX);

        System.out.print(" Enter DIGIT(y) coordinate to shoot: ");
        int y = userInput.getIntInput();

        int coordinatesDigitY = y - 1;
        System.out.println("Y " + coordinatesDigitY);

        int[] coordinates = new int[2];
        coordinates[1] = coordinatesLetterX;
        coordinates[0] = coordinatesDigitY;

        return coordinates; // Scanner from user
    }

}