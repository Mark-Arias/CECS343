package Backend;

import java.util.Objects;

public class ATM_Card {
    private String cardNumber;
    private int PIN;

    public ATM_Card(String cardNumber, int PIN) {
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }

    String getCardNumber() {
        return cardNumber;
    }

    int getPIN() {
        return PIN;
    }

    void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    void setPIN(int PIN) {
        this.PIN = PIN;
    }

    @Override
    public String toString() {
        return "Card Number: " + cardNumber + "\nPIN: " + PIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM_Card atm_card = (ATM_Card) o;
        return PIN == atm_card.PIN &&
                Objects.equals(cardNumber, atm_card.cardNumber);
    }

}
