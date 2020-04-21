package Backend;

public class Checking extends Account {

    /**
     * Constructor for Account class
     * @param accNum account number
     * @param balance existing balance
     */
    public Checking(String accNum, double balance, double withdrawLimit) {
        super(accNum, balance, withdrawLimit);
    }
}
