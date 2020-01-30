package app;


public class Main {

    

    public static void main(String[] args) {

        // Ocean ocean = new Ocean();
        // ocean.fillOcean();
        // Ship battleship = new Ship(5, "B",4,4);
        // ocean.placeShip(cruiser);
        // ocean.placeShip(battleship);
        // ocean.printOcean();

        Menu.menu();

        Player humanPlayer = new HumanPlayer();
        humanPlayer.printPlayerOcean();

        // Ship cruiser = new Ship(4, "C", 0,0);
        //humanPlayer.putShipOnOcean(cruiser);

        humanPlayer.printPlayerOcean();

        // Ship hit = new Ship(1, "X", 9, 8);

        //humanPlayer.playerBoard.ocean[0][1].look = "!";
        // Ship shot = new Ship(1, "X", 9,0);
        // humanPlayer.putShipOnOcean(shot);
        humanPlayer.printPlayerOcean();
        // System.out.println(cruiser.shipSquares[0].look);

    }
}
