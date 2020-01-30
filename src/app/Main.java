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
        humanPlayer.clearScreen();
        humanPlayer.printPlayerOcean();

        Ship cruiser = new Ship(4, "[C]", 1, 0);
        Ship battleship = new Ship(5, "[B]", 4, 3);
        humanPlayer.putShipOnOcean(cruiser);
        humanPlayer.putShipOnOcean(battleship);

        Ship cruiser2 = new Ship(4, "[C]", 5, 7);
        Ship battleship2 = new Ship(5, "[B]", 2, 5);
        humanPlayer.putShipOnOcean(cruiser2);
        humanPlayer.putShipOnOcean(battleship2);


        // Ship hit = new Ship(1, "X", 9, 8);
        int[] coordinates = humanPlayer.createShoot();
        // int[] coordinates2 = AIPlayer.createShoot(); // is not working
        // humanPlayer.playerBoard.ocean[0][1].look = "[X]";
        // humanPlayer.playerBoard.ocean[0][0].look = "[X]";
        humanPlayer.recievedShoot(coordinates);
        
        // Ship shot = new Ship(1, "X", 9,0);
        // humanPlayer.putShipOnOcean(shot);
        // humanPlayer.clearScreen();
        humanPlayer.printPlayerOcean();
        // System.out.println(cruiser.shipSquares[0].look);

    }
    // public static String fromUser(){

    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Please enter coordinates to shoot: ");
    //     String userInput = scanner.nextLine();

    //     return userInput;
    
}
