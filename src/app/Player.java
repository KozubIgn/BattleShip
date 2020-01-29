package app;

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
    
    public abstract String createShoot();

    public String convertCoordniates(String coordinates){
        return "00";
    }

}