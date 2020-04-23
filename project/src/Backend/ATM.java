package Backend;

public class ATM {

    private String bankName, state;
    private long ATM_id;
    private Account account;
    private ATM_Card card;

    public ATM(String bankName, long ATM_id, String state, Account account, ATM_Card card) {
        this.bankName = bankName;
        this.ATM_id = ATM_id;
        this.state = state;
        this.account = account;
        this.card = card;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getATM_id() {
        return ATM_id;
    }

    public void setATM_id(long ATM_id) {
        this.ATM_id = ATM_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public ATM_Card getCard() {
        return card;
    }

    public void setCard(ATM_Card card) {
        this.card = card;
    }

    double checkBalance(Account acc) {
        return acc.getBalance();
    }

    boolean withdrawFunds(Account acc, double amt) {
        if (amt > checkBalance(acc)) {
            return false;
        } else {
            acc.setBalance(acc.getBalance() - amt);
            return true;
        }
    }

    boolean depositFunds(Account acc, double amt) {
        if (amt < 0) {
            return false;
        } else {
            acc.setBalance(acc.getBalance() + amt);
            return true;
        }
    }

    boolean transferFunds(Account origin, Account recipient, double amt) {
        if (origin.equals(recipient)) {
            System.out.println("Cannot transfer to the same account");
            return false;
        } else if (amt > origin.getBalance()) {
            System.out.println("Cannot transfer funds more greater than present balance.\n");
            return false;
        } else {
            origin.setBalance(origin.getBalance() - amt);
            recipient.setBalance(recipient.getBalance() + amt);
            return true;
        }
    }
}
