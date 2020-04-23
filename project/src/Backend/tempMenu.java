package Backend;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class tempMenu {

    private Map<ATM_Card, Account> map = new HashMap<>();
    public static void main(String args[]){
        System.out.println(getChoice());
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
