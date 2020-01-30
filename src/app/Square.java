package app;

public class Square {

    String look = "[ ]";

    public Square(){
    }

    public String getLook() {
        return look;
    }

    public void receiveHit(){
        look = "[X]";
    }

	public String displayLook() {
		return null;
	}
}
