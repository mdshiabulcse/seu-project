package purchase;

public class Payments {
    protected String paymentType;
    protected String totalAmount;

    public Payments(String paymentType, String totalAmount) {
        this.paymentType = paymentType;
        this.totalAmount = totalAmount;
    }

    // Getter for totalAmount
    public String getTotalAmount() {
        return totalAmount;
    }
}
