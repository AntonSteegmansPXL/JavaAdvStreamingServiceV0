package be.pxl.ja.streamingservice.model;

public class CreditCardNumber {

    private static final int LENGTH = 16;
    private static final int CVC_LENGTH = 3;

    private CreditCardType creditCardType;
    private String number;
    private String cvc;

    public CreditCardNumber(String cardNumber, String cvc) {
        if (!isNumeric(number) || number.length() != LENGTH) {
            throw new IllegalArgumentException("A card number must have " + LENGTH + " digits.");
        }
        creditCardType = getCreditCardType(number);
        if (creditCardType == null) {
            throw new IllegalArgumentException("This is not a valid credit card");
        }

        if (!isNumeric(cvc) || cvc.length() != CVC_LENGTH) {
            throw new IllegalArgumentException("A CVC number must have " + CVC_LENGTH + " digits.");
        }

        this.number = cardNumber;
        this.cvc = cvc;
    }

    private boolean isNumeric(String text) {
        if (text == null || text.length() == 0) {
            return false;
        }
        try {
            Long.parseLong(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public CreditCardType getCreditCardType(String number) {
        for (CreditCardType cardType : CreditCardType.values()) {
            if (cardType.getFirstNumber() == Integer.parseInt(number.substring(0, 1))) {
                return cardType;
            }
        }
        return null;
    }

    public String getCvc() {
        return cvc;
    }

    public String getNumber() {
        return number;
    }

}
