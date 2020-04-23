package Backend;
import java.io.Serializable;

public abstract class Account implements Serializable {

    private String accNum;
    private double balance;
    private double withdrawLimit;
    private ATM_Card card;

    /**
     * Constructor for Account class
     * @param accNum account number
     * @param balance balance current account has
     */
    public Account(String accNum, double balance, double withdrawLimit, ATM_Card card) {
        this.accNum = accNum;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
        this.card = card;
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

    ATM_Card getCard() {
        return card;
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

    void setCard(ATM_Card card) {
        this.card = card;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public String toString() {
        return "Account number: " + accNum;
    }
}
