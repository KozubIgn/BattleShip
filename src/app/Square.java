package app;

import java.util.Objects;

public class Square {

    String look = "[ ]";

    public Square() {
    }

    public String getLook() {
        return look;
    }

    public void receiveHit() {
        if (Objects.equals(look, new String("[ ]"))) {
            look = "[X]";
        } else if (Objects.equals(look, new String("[8]"))) {
            look = "[*]";
        }
    }

    public String displayLook() {
        return null;
    }
}
