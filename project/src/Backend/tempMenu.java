package Backend;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class tempMenu {

    private static ATM_Card card1 = new ATM_Card("123", 123);
    private static ATM console = new ATM();
    private static ATM_Card card2 = new ATM_Card("69", 69);
    private static ArrayList<Account> userAccs = new ArrayList<>();



    public static void main(String args[]) {
        displayMenu();
    }

    private static void displayMenu(){
        Scanner kb = new Scanner(System.in);
        String input = "";
        char flag = 'D';

        while (flag != 'q'){
            System.out.print("D)eposit\nW)ithdraw\nT)ransfer\nC)heck Balance\nQ)uit");
            System.out.print("\nSelect choice: ");
            flag = kb.next().toLowerCase().charAt(0);

            if (flag == 'd' || flag == 'w' || flag == 't') {
                System.out.println("Which account would you like to choose from?");
                input = kb.next();
            }
        }
        
        kb.close();
    }

    private static void transferMenu() {

    }

    private static void withdrawMenu() {

    }

    private static void depositMenu() {

    }

    private static void checkBalance() {

    }
}
