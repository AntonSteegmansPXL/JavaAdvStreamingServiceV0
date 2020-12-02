package be.pxl.ja.streamingservice.model;

public enum CreditCardType {
    VISA("Visa"),
    MASTERCARD("Mastercard");

    private String name;

    CreditCardType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
