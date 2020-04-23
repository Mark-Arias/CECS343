package Backend;

public class ATM {
    private String bankName, state;
    private long ATM_id;
    private Account account;

    public ATM(String bankName, long ATM_id, Account account, String state) {
        this.bankName = bankName;
        this.ATM_id = ATM_id;
        this.account = account;
        this.state = state;
    }

    String getBankName() {
        return bankName;
    }

    long getATM_id() {
        return ATM_id;
    }

    Account getAccount() {
        return account;
    }

    String getState() {
        return state;
    }

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void setATM_id(long ATM_id) {
        this.ATM_id = ATM_id;
    }
}
