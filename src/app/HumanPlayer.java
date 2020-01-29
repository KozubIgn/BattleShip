package app;

public class HumanPlayer extends Player{

    public int[] createShoot(){
        String fromUser = "A1";
        return convertCoordniates(fromUser); // Scanner from user
    }

}