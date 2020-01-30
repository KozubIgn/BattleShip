package app;
import java.util.Scanner;

public class UserGlobalInput {

    public Scanner scanner = new Scanner(System.in);

    public String getStringInput() {
        System.out.println("Enter string: ");
        return scanner.next();
    }

    public int getIntInput() {
        System.out.println("Enter number: ");
        return scanner.nextInt();
    }

}