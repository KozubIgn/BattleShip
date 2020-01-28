package app;

import java.util.ArrayList;
import java.util.List;

public class Ocean {

    Square[][] ocean;

    public Ocean() {
        ocean = new Square[10][10];
    }

    public Square[][] getOcean() {
        return ocean;
    }

    public Square[][] fillOcean() {
        System.out.println("");
        for (Square[] line : ocean) {
            for (int i = 0; i < 10; i++) {
                line[i] = new Square();
            }
        }
        return ocean;
    }

    public void printOcean() {
        String printedLine = "";
        for (Square[] line : ocean) {
            for (int i = 0; i < line.length; i++) {
                printedLine += line[i].getLook() + "  ";
            }
            System.out.println(printedLine);
            printedLine = "";
        }System.out.println("");
    }

    public List<Integer> shipHelper() {
        List<Integer> shipLen = new ArrayList<>();
        for (int i = 2; i < 6; i++) {
            shipLen.add(i);
        }
        return shipLen;
    }

    
    public void placeShip(Ship ship) {
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        for (int i = 0; i < ship.getSize(); i++) {
            ocean[y][x+i] = ship.shipSquares[i];
        }
    }

}