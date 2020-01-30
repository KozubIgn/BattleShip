package app;
import java.util.Scanner;
import java.io.IOException;

public class Menu {
    public static int menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Opponent H/C");
        System.out.println("     2. Start game");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        return w;
        
    }
    public static void menu2(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        
        int choice = menu();

        while(choice!=0){
            switch(choice){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 0:

                break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            System.out.println("\npress Enter to continue...");
            System.in.read();

            choice = menu();
        }

in.close();    }
}