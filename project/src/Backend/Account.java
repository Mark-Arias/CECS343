package Backend;

public abstract class Account {

    private String accNum;
    private double balance;

    /**
     * Constructor for Account class
     * @param accNum account number
     * @param balance balance current account has
     */
    public Account(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    String getAccNum() {
        return accNum;
    }

    double getBalance() {
        return balance;
    }

    void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }


}
