package Backend;
import java.util.Scanner;

public class tempMenu {
    public static void main(String args[]){
        System.out.println(getChoice());
    }

    public static char getChoice(){
        Scanner kb = new Scanner(System.in);
        char flag = 'D';

        while (flag != 'Q'){
            System.out.print("D)eposit\nW)ithdraw\nT)ransfer\nC)heck Balance\nQ)uit");
            System.out.print("\nSelect choice: ");
            flag = kb.next().charAt(0);
        }
        return flag;
    }
}
