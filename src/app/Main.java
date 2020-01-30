package app;

import java.util.Random;

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

        String lettersCoordinates = "ABCDEFGHIJ";
        Ship[] ships = new Ship[] { new Ship("cruizer", 3, "[c]"), new Ship("battleship", 4, "[B]"),
                new Ship("carrier", 5, "[C]"), new Ship("submarine", 3, "[S]"), new Ship("destroyer", 2, "[D]") };

        // for (Ship ship:ships){
        //     System.out.println("Your ship:" + ship.name);
        //     System.out.println("Do you want to put ship horizontaly (H) or verticaly(V)?: ");
        //     UserGlobalInput userInput = new UserGlobalInput();
        //     String position = userInput.getStringInput().toUpperCase();
            
        //     System.out.println("Please enter letter coordinate to set your ship: ");
        //    String x = userInput.getStringInput().toUpperCase();
            
        //     System.out.println("Please enter letter coordinate to set your ship: ");
        //     int y = userInput.getIntInput();

        // int coordinatesLetterX = lettersCoordinates.indexOf(x);
        //     humanPlayer.putShipOnOcean(coordinatesLetterX, y, ship.size, position);
        //     humanPlayer.printPlayerOcean();
        // }
        
        for (Ship ship:ships){
            Random random = new Random();
            int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int randonNumberposition = random.nextInt(2);
            String position = "";
            if (randonNumberposition == 0){
                position = "V";
            }else{
                position = "H";
            }
            int randomNumberX = random.nextInt(numbers.length);
            int randomNumberY = random.nextInt(numbers.length);

            aiPlayer.putShipOnOcean(randomNumberX, randomNumberY, ship.size, position);
            aiPlayer.printPlayerOcean();
        }

         
                // humanPlayer.putShipOnOcean(cruiser);
        // humanPlayer.putShipOnOcean(battleship, "V");
        // humanPlayer.putShipOnOcean(carrier);
        // humanPlayer.putShipOnOcean(submarine);
        // humanPlayer.putShipOnOcean(destroyer);




        // Ship hit = new Ship(1, "X", 9, 8);
        while(true){
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
        aiPlayer.printPlayerOcean();}
        // System.out.println(cruiser.shipSquares[0].look);

    }
    // public static String fromUser(){

    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Please enter coordinates to shoot: ");
    //     String userInput = scanner.nextLine();

    //     return userInput;
    
}
