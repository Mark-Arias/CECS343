package Backend;

public class Checking extends Account {

    /**
     * Constructor for Account class
     * @param accNum account number
     * @param balance existing balance
     */
    public Checking(String accNum, double balance, double withdrawLimit, ATM_Card card) {
        super(accNum, balance, withdrawLimit, card);
    }
}
