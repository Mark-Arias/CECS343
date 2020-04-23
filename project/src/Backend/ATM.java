package Backend;

public class ATM {

    private String bankName;
    private long ATM_id;
    private String state;
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


}
