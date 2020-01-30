package app;
import java.util.Scanner;

public class UserGlobalInput {

    public Scanner scanner = new Scanner(System.in);

    public String getStringInput() {
        
        return scanner.next();
    }

    public int getIntInput() {
        
        return scanner.nextInt();
    }

}