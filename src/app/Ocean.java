package app;

public class Ocean {

    Square[][] ocean;
    static int ROWS = 10;
    static int COLUMNS = 10;

    public Ocean() {
        ocean = new Square[ROWS][COLUMNS];
        this.fillOcean();
    }

    public Square[][] getOcean() {
        return ocean;
    }

    private void fillOcean() {
        // System.out.println("");
        for (Square[] line : ocean) {
            for (int i = 0; i < 10; i++) {
                line[i] = new Square();
            }
        }
    }

    public void printOcean() {
        String printedLine = "";
        for (Square[] line : ocean) {
            for (int i = 0; i < line.length; i++) {
                printedLine += line[i].getLook() + "";
            }
            System.out.println(printedLine);
            printedLine = "";
        }System.out.println("");
    }

    // public List<Integer> shipHelper() {
    //     List<Integer> shipLen = new ArrayList<>();
    //     for (int i = 2; i < 6; i++) {
    //         shipLen.add(i);
    //     }
    //     return shipLen;
    // }

    
    public void placeShip(Ship ship) {
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        for (int i = 0; i < ship.getSize(); i++) {
            ocean[y][x+i] = ship.shipSquares[i];
        }
    }
    public static Ship 

    public void shoot(int[] coordinates){

        int x = coordinates[0];
        int y = coordinates[1];

        this.ocean[x][y].receiveHit();

    }

}