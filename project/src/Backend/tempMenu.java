package Backend;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class tempMenu {

    private Map<ATM_Card, Account> map = new HashMap<>();
    private static ATM_Card card1 = new ATM_Card("123", 123);
    private static ATM console = new ATM();
    private static ATM_Card card2 = new ATM_Card("69", 69);


    public static void main(String args[]) {
        ArrayList<Account> map2 = console.getAccount(card1);
        for (int i = 0; i < map2.size(); i++)
            System.out.println(map2.get(i));
        //System.out.println(map);
    }

    public static char getChoice(){
        Scanner kb = new Scanner(System.in);
        char flag = 'D';

        while (flag != 'Q'){
            System.out.print("D)eposit\nW)ithdraw\nT)ransfer\nC)heck Balance\nQ)uit");
            System.out.print("\nSelect choice: ");
            flag = kb.next().toLowerCase().charAt(0);
        }
        
        kb.close();
        return flag;
    }
}
