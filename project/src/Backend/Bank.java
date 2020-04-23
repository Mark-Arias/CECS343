package Backend;
import java.util.*;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();
    private Map<ATM_Card, ArrayList<Account>> list = new HashMap<>();

    ArrayList<Account> createList() {
        /** 
        ATM_Card card1 = new ATM_Card("123", 123);
        Account act1 = new Checking("123", 1000, 3000, card1);
        Account act2 = new Savings("321", 1000, 3000, card1);

        accounts.add(act1);
        accounts.add(act2);
        list.put(card1, accounts);
        */
        return accounts;
    }


}