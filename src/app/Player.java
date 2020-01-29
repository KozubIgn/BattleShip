package app;

public abstract class Player {

    public Ocean playerBoard;

    public Player() {
        playerBoard = new Ocean();
    }

    public void printPlayerOcean() {
        playerBoard.printOcean();
    }

    public void putShipOnOcean(Ship ship) {
        playerBoard.placeShip(ship);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public abstract int[] createShoot();

    public int[] convertCoordniates(String coordinates) {
        // char X = coordinates.charAt(0);
        // char Y = coordinates.charAt(-1);

        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;

        return result;
    }

    public void recievedShoot(int[] coordinates) {
        playerBoard.shoot(coordinates);

    }
}