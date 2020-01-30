package app;

public abstract class Player {

    public Ship[] ships;
    public String position;
    public Ocean playerBoard;

    public Player() {
        playerBoard = new Ocean();
    }

    public void printPlayerOcean() {
        playerBoard.printOcean();
    }

    public void putShipOnOcean(Ship ship, String position) {
        System.out.println("Metoda putShipOnOcean + Ship " + ship + " Position " + position);
        this.position = position;
        playerBoard.placeShip(ship, position);
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