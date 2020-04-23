package Backend;

import java.util.*;
import java.io.*;

public class ATM implements Serializable {


    /**
     * request pin
     * displayMenu
     * driver
     */

    private ATM_Card currentCard;

    private Map<ATM_Card, ArrayList<Account>> map = new HashMap<>();

    private ArrayList<Account> accounts = new ArrayList<>();
    private Map<ATM_Card, ArrayList<Account>> list = new HashMap<>();

    private ATM_Card card1 = new ATM_Card("123", 123);
    private ATM_Card card2 = new ATM_Card("69", 69);

    Account act1 = new Checking("123", 1000, 3000, card1);
    Account act2 = new Savings("321", 1000, 3000, card1);


    Account act3 = new Checking("098", 1000, 3000, card2);
    Account act4 = new Savings("420", 1000, 3000, card2);


    int requestPin() {
        Scanner kb = new Scanner(System.in);
        String pin = "";
        System.out.println("Enter PIN: ");
        pin = kb.nextInt();
    }
    ArrayList<Account> getAccount(ATM_Card card) {

        if (list.containsKey(card)) {
            return list.get(card);
        } else {
            System.out.println("No accounts associated with this card.");
            return null;
        }
    }

    boolean verifyCard(Account acc, ATM_Card card) {
        return acc.getCard().equals(card);
    }

    void acceptCard(ATM_Card card) {
        currentCard = card;
    }

    void removeCard() {
        currentCard = null;
    }

    double checkBalance(Account acc) {
        return acc.getBalance();
    }

    boolean withdrawFunds(Account acc, double amt) {
        if (amt > checkBalance(acc)) {
            System.out.println("Cannot withdraw funds greater than the present balance of the account.");
            return false;
        } else {
            acc.setBalance(acc.getBalance() - amt);
            return true;
        }
    }

    boolean depositFunds(Account acc, double amt) {
        if (amt < 0) {
            System.out.println("Cannot deposit negative funds.");
            return false;
        } else {
            acc.setBalance(acc.getBalance() + amt);
            return true;
        }
    }

    boolean transferFunds(Account origin, Account recipient, double amt) {
        if (origin.equals(recipient)) {
            System.out.println("Cannot transfer to the same account");
            return false; // dont display origin account when selecting recipient account
        } else if (amt > origin.getBalance()) {
            System.out.println("Cannot transfer funds greater than present balance.");
            return false;
        } else {
            origin.setBalance(origin.getBalance() - amt);
            recipient.setBalance(recipient.getBalance() + amt);
            return true;
        }
    }
}
