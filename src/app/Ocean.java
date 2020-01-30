package app;

import java.util.Objects;

public class Ocean {

    Square[][] ocean;

    public Ocean() {
        ocean = new Square[10][10];
        this.fillOcean();
    }

    public Square[][] getOcean() {
        return ocean;
    }

    private void fillOcean() {
        // System.out.println("");
        for (Square[] line : ocean) {
            for (int i = 0; i < 10; i++) {
                line[i] = new Square();
            }
        }
    }

    public void printOcean() {
        String printedLine = "";
        System.out.println("     A  B  C  D  E  F  G  H  I  J");
        System.out.println();
        int n = 1;
        for (Square[] line : ocean) {

            for (int i = 0; i < line.length; i++) {
                printedLine += line[i].getLook() + "";
            }
            if (n == 10) {
                System.out.println(n + "  " + printedLine);

            } else {
                System.out.println(n + "   " + printedLine);
            }
            ++n;
            printedLine = "";
        }
        System.out.println("");
    }

    // public List<Integer> shipHelper() {
    // List<Integer> shipLen = new ArrayList<>();
    // for (int i = 2; i < 6; i++) {
    // shipLen.add(i);
    // }
    // return shipLen;
    // }

    // public void placeShip(Ship ship, String position) {
    public void placeShip(int x, int y, int size, String position) {

        // int x = ship.getInitialPosX();
        // int y = ship.getInitialPosY();

        if (Objects.equals(position, new String("V"))) {
            for (int i = 0; i < size; i++) {
                Square shipSquare = new Square();
                shipSquare.look = "[8]";
                ocean[y + i][x] = shipSquare;
                System.out.println("statek");
            }
        } else if (Objects.equals(position, new String("H"))) {
            for (int i = 0; i < size; i++) {
                Square shipSquare = new Square();
                shipSquare.look = "[8]";
                ocean[y][y + i] = shipSquare;
                System.out.println("f");

            }
        }
    }

    public void shoot(int[] coordinates) {

        int x = coordinates[0];
        int y = coordinates[1];

        this.ocean[x][y].receiveHit();

    }

}