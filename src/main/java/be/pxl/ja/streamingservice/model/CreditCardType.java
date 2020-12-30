package be.pxl.ja.streamingservice.model;

public enum CreditCardType {
    VISA("Visa", 4),
    MASTERCARD("Mastercard", 5);

    private String name;
    private final int firstNumber;

    CreditCardType(String name, int firstNumber){
        this.name = name;
        this.firstNumber = firstNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstNumber() {
        return firstNumber;
    }
}
