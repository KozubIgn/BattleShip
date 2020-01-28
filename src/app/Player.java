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

    public void hit(Ship ship){
        playerBoard.placeShip(ship);
    }

}