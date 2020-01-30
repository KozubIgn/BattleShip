package app;

import java.io.ObjectStreamConstants;

public class Square {
    private int row;
    private int column;
    private boolean isShip = false;
    private boolean isHit;
    private Square square;
    protected Ocean ocean;

    String look = "[ ]";

    public Square(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Square(int row, int column, Ocean ocean) {
        this.row = row;
        this.column = column;
        this.ocean = ocean;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String displayLook() {
        if(isShip){
            if (isHit){
                return "X";
            }
        }else if(!isShip){
            if(isHit){
                return "*";
            }

        }
return "~";
    }
       public void setIsShip(boolean value){
           isShip = value;
       }
       public boolean getIsShip(){
           return isShip;
       }
       public void setIsHit(Boolean value){
           isHit = value;
       }
       public boolean getIsHit(){
           return isHit;
       }
       //determinates status on square based on shot
       public Square determinateShot(Square shot){
           Square nextshot = new Square(getRow(), getColumn(),ocean);
           //if current square is a ship
           if(getIsShip()){
               if(shot.getRow()==getRow()&& shot.getColumn()==getColumn()){
                   setIsHit(true);

               }
           }
           return nextshot;

       }
    public String receiveHit() {
        String shotlook = "[X]";
        return shotlook;
    }
}
