package app;

public class HumanPlayer extends Player{

    // public char getChar(){

    //     Scanner charScanner = new Scanner(System.in);
    //     System.out.println("Input Letter: ");
    //     charScanner 
    // }

    public int[] createShoot(){
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Please enter letter coordinate to shoot: ");
        // String userInputLetter = scanner.nextLine().toUpperCase();
        // String lettersCoordinates = "ABCDEFGHIJ";
        // System.out.print("Please enter digit coordinate to shoot: ");
        // int userInputDigit = scanner.nextInt();

        UserGlobalInput userInput = new UserGlobalInput();
        userInput.getIntInput();
        System.out.print("Please enter letter coordinate to shoot: ");
        String x = userInput.getStringInput();
        int y = userInput.getIntInput();


        String lettersCoordinates = "ABCDEFGHIJ";
        int coordinatesLetterX = lettersCoordinates.indexOf(x); 
        System.out.println("X " + coordinatesLetterX);
        
        System.out.print("Please enter digit coordinate to shoot: ");

        int coordinatesDigitY = y - 1;
        System.out.println("Y "+ coordinatesDigitY);

        int[] coordinates = new int[2];
        coordinates[0] = coordinatesLetterX;
        coordinates[1] = coordinatesDigitY;


        return coordinates; // Scanner from user
    }


}