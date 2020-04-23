package Backend;

public abstract class Account {

    private String accNum;
    private double balance;
    private double withdrawLimit;
    //private ATM_Card card;

    /**
     * Constructor for Account class
     * @param accNum account number
     * @param balance balance current account has
     */
    public Account(String accNum, double balance, double withdrawLimit) {
        this.accNum = accNum;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
        //this.card = card;
    }

    String getAccNum() {
        return accNum;
    }

    double getBalance() {
        return balance;
    }

    double getWithdrawLimit() {
        return withdrawLimit;
    }

    void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
