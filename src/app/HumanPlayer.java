package app;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public int[] createShoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter letter coordinate to shoot: ");
        String userInputLetter = scanner.nextLine().toUpperCase();
        String lettersCoordinates = "ABCDEFGHIJ";
        System.out.print("Please enter digit coordinate to shoot: ");
        int userInputDigit = scanner.nextInt();


        int coordinatesLetterX = lettersCoordinates.indexOf(userInputLetter); 
        System.out.println("X " + coordinatesLetterX);
        int coordinatesDigitY = userInputDigit - 1;
        System.out.println("Y "+ coordinatesDigitY);

        int[] coordinates = new int[2];
        coordinates[0] = coordinatesLetterX;
        coordinates[1] = coordinatesDigitY;
        

        return coordinates; // Scanner from user
    }


}