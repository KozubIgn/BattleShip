package app;

public abstract class Player {

    public Ship[] ships;

    public Ocean playerBoard;

    public Player() {
        playerBoard = new Ocean();
    }

    public void printPlayerOcean() {
        playerBoard.printOcean();
    }

    public void putShipOnOcean(int x,int y, int size, String position) {
        playerBoard.placeShip(x, y, size, position);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public abstract int[] createShoot();


    public void recievedShoot(int[] coordinates) {
        playerBoard.shoot(coordinates);

    }

}