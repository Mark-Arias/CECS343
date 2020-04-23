package Backend;

import java.util.Objects;

public class ATM_Card {
    private String cardNumber;
    private short PIN;

    public ATM_Card(String cardNumber, short PIN) {
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }

    String getCardNumber() {
        return cardNumber;
    }

    short getPIN() {
        return PIN;
    }

    void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    void setPIN(short PIN) {
        this.PIN = PIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM_Card atm_card = (ATM_Card) o;
        return PIN == atm_card.PIN &&
                Objects.equals(cardNumber, atm_card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, PIN);
    }
}
