package app;

public class Ocean {

    Square[][] ocean;

    public Ocean() {
        ocean = new Square[10][10];
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
        UserGlobalInput userInput = new UserGlobalInput();

        
        int x = ship.getInitialPosX();
        int y = ship.getInitialPosY();
        
        if (userInput.getStringInput() == "V"){ 
            for (int i = 0; i < ship.getSize(); i++) {
                ocean[y + i][x] = ship.shipSquares[i];
                ocean[y + i + 1][x + 1] = ship.shipSquares[1];
        }
    }
        else if (userInput.getStringInput() == "H"){
            for (int i = 0; i < ship.getSize(); i++) {
                ocean[y][x + i] = ship.shipSquares[i];

            }
        }
    }
    public void shoot(int[] coordinates){

        int x = coordinates[0];
        int y = coordinates[1];

        this.ocean[x][y].receiveHit();

    }

    

}