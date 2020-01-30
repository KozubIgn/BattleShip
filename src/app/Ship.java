package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    boolean isVertical;
    boolean onMap = true;
    boolean generate = true;
    int size;
    int initialPosX;
    int initialPosY;
    private Square shipSquare[];
    List<Square> shipHitPoints = new ArrayList(size);
    private String name;
    private Square coordinates;

    // constructor
    public Ship(Square coordinates, String name, int size, int initialPosX, int initialPosY, Square shipSquare) {
        this.coordinates = coordinates;
        this.name = name;
        this.size = size;
        this.shipSquare = new Square[size];
        this.initialPosX = initialPosX;
        this.initialPosY = initialPosY;
        // fillShipSquares();
    }

    // generate array of ship points
    public void createShipPointArrays() {
        for (int i = 0; i < size; i++) {
            if (isVertical) {
                shipSquare[i] = new Square(coordinates.getRow(), coordinates.getColumn() + i);
            } else {
                shipSquare[i] = new Square(coordinates.getRow() + i, coordinates.getColumn());
            }
            shipSquare[i].setIsShip(true);
        }
    }

    public Square getcoordinates() {
        return coordinates;
    }

    public Square[] getShipPoints() {
        return shipSquare;
    }

    public int getShipSize() {
        return size;
    }

    public boolean isVertical() {
        return isVertical;
    }

    // returns true of ship squares is on board, false otherwise
    boolean containsSquare(Square square) {
        if (square.getRow() < 10 && square.getRow() >= 0 && square.getColumn() < 10 && square.getColumn() >= 0) {
            return true;
        }
        return false;
    }

    // checks for collision between ships
    boolean isCollisionWith(Ship ship) {
        // check each square and if they are equal than there
        // is a collision
        Square square[] = ship.getShipPoints();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < ship.size; j++) {
                if (shipSquare[i].getRow() == square[j].getRow()
                        && shipSquare[i].getColumn() == square[j].getColumn()) {
                    // System.out.println("The two ships collide");
                    return true;
                }
            }
        }
        return false;
    }

    // fires at ship
    void shotFiredAtPoint(Square square) {
        if (isHitAtSquare(square)) {
            shipHitPoints.add(square);
        } else {
        }
    }

    // returns true if ship got hit, false otherwise
    boolean isHitAtSquare(Square square) {
        for (int i = 0; i < shipSquare.length; i++) {
            if (shipSquare[i].getRow() == square.getRow() && shipSquare[i].getColumn() == square.getColumn()) {
                return true;
            }
        }
        return false;
    }

    // return number of hits that ship received
    int hitCount() {
        return shipHitPoints.size();
    }

    // checks to see if a ship has sunk
    void sunkStatus(int numOfShips) {
        if (getShipSize() == hitCount()) {
            numOfShips--;
            System.out.println("You have sunked a ship with length " + getShipSize());
            System.out.println(numOfShips + " ships left on the board");
        }
    }

    // public String getLook() {
    // return shipLook;
    // }

    public int getInitialPosX() {
        return initialPosX;
    }

    public int getInitialPosY() {
        return initialPosY;
    }

    public int getSize() {
        return size;
    }
    // random point on board as the start of ship
    public  static Square getRandomStartPoint(){
        Random random = new Random();
        int x= random.nextInt(10);
        int y = random.nextInt(10);
        return new Square(x,y);}
//return random length for ship length
        public static int getRandomShipLength(){
            Random random = new Random();
            return random.nextInt(2-6);
        }
// generate random orientation for ship
public static boolean getOrientation(){
    Random random = new Random();
    boolean vertical = true;

    if (random.nextInt(2)==1){
        vertical = false;

    }
    return vertical;
}
    

    // public void fillShipSquares() {
    // for (int i = 0; i < shipSquares.length; i++) {
    // shipSquares[i] = new Square();
    // shipSquares[i].look = shipLook;
    // }
    // }

}
