package app;


public class Main {

    public static void main(String[] args) {

        Ocean ocean = new Ocean();
        ocean.fillOcean();
        Ship cruiser = new Ship(4, "C", 0,0, true);
        Ship battleship = new Ship(5, "B",4,4, false);
        ocean.placeShip(cruiser);
        ocean.placeShip(battleship);
        ocean.printOcean();

    }
}
