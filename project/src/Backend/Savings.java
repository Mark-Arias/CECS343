package Backend;

public class Savings extends Account {

    /**
     * Constructor for Account class
     * @param accNum  account number
     * @param balance balance current account has
     */
    public Savings(String accNum, double balance, double withdrawLimit, ATM_Card card) {
        super(accNum, balance, withdrawLimit, card);
    }
}
