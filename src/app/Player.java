package app;

import java.util.*;

public abstract class Player{

    public Ocean playerBoard;

    public Player(){
        playerBoard = new Ocean();
    }

    public void printPlayerOcean(){
        playerBoard.printOcean();
    }
    
    public void putShipOnOcean(Ship ship){
        playerBoard.placeShip(ship);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public abstract int[] createShoot(String fromUser);

    public int[] convertCoordniates(String coordinates){
        char X = coordinates.charAt(0);
        // System.out.println(X);
        char Y = coordinates.charAt(1);
        // System.out.println(Y);

        int x = Character.getNumericValue(X);
        int y = Character.getNumericValue(Y);

        int[] result = new int[2];
        // System.out.println(result);
        result[0] = x - 10;
        result[1] = y - 1;
        // System.out.println("x" + x + "y" + y);

        return result;
    }

    public void recievedShoot(int[] coordinates){
        playerBoard.shoot(coordinates); 

    }
}