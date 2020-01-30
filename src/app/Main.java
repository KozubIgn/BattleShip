package app;

public class Main {

    public static void main(String[] args) {
        Menu.menu();
        // Ocean ocean = new Ocean();
        // ocean.fillOcean();
        // Ship battleship = new Ship(5, "B",4,4);
        // ocean.placeShip(cruiser);
        // ocean.placeShip(battleship);
        // ocean.printOcean();

        Player humanPlayer = new HumanPlayer();
        AIPlayer aiPlayer = new AIPlayer();
        humanPlayer.clearScreen();
        humanPlayer.printPlayerOcean();



        // Ship cruiser = new Ship(3, "[c]", 0, 1 , true);
        Ship battleship = new Ship(4, "[B]", 4, 3);
        // Ship carrier = new Ship(5, "[C]", 3, 5, true);
        // Ship submarine = new Ship(3, "[S]", 3, 7, true);
        // Ship destroyer = new Ship(2, "[D]", 3, 9, true);

        // humanPlayer.putShipOnOcean(cruiser);
        humanPlayer.putShipOnOcean(battleship, "V");
        // humanPlayer.putShipOnOcean(carrier);
        // humanPlayer.putShipOnOcean(submarine);
        // humanPlayer.putShipOnOcean(destroyer);




        // Ship hit = new Ship(1, "X", 9, 8);
        int[] coordinates = humanPlayer.createShoot();
        int[] coordinates2 = aiPlayer.createShoot();
        // humanPlayer.playerBoard.ocean[0][1].look = "[X]";
        // humanPlayer.playerBoard.ocean[0][0].look = "[X]";
        humanPlayer.recievedShoot(coordinates);
        aiPlayer.recievedShoot(coordinates2);
        
        // Ship shot = new Ship(1, "X", 9,0);
        // humanPlayer.putShipOnOcean(shot);
        // humanPlayer.clearScreen();
        humanPlayer.printPlayerOcean();
        aiPlayer.printPlayerOcean();
        // System.out.println(cruiser.shipSquares[0].look);

    }
    // public static String fromUser(){

    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Please enter coordinates to shoot: ");
    //     String userInput = scanner.nextLine();

    //     return userInput;
    
}
