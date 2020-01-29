package app;


public class Main {

    public static void main(String[] args) {

        // Ocean ocean = new Ocean();
        // ocean.fillOcean();
        // Ship battleship = new Ship(5, "B",4,4);
        // ocean.placeShip(cruiser);
        // ocean.placeShip(battleship);
        // ocean.printOcean();

        Player humanPlayer = new HumanPlayer();
        // humanPlayer.clearScreen();
        humanPlayer.printPlayerOcean();

        Ship cruiser = new Ship(4, "[C]", 1, 0);
        Ship battleship = new Ship(5, "[B]", 4, 3);
        humanPlayer.putShipOnOcean(cruiser);
        humanPlayer.putShipOnOcean(battleship);

        // humanPlayer.printPlayerOcean();

        // Ship hit = new Ship(1, "X", 9, 8);
        String coordinates = humanPlayer.createShoot();
        // humanPlayer.playerBoard.ocean[0][1].look = "[X]";
        // humanPlayer.playerBoard.ocean[0][0].look = "[X]";

        // Ship shot = new Ship(1, "X", 9,0);
        // humanPlayer.putShipOnOcean(shot);
        // humanPlayer.clearScreen();
        humanPlayer.printPlayerOcean();
        // System.out.println(cruiser.shipSquares[0].look);

    }
}
