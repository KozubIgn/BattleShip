package app;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public int[] createShoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter coordinates to shoot: ");
        String userInput = scanner.nextLine();
        
        return convertCoordniates(userInput); // Scanner from user
    }


}