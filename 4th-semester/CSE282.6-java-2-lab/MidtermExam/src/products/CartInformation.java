package products;

public class CartInformation {
    protected int quantity;
    protected double unitPrice;
    protected double grossPrice;

    public CartInformation(int quantity, double unitPrice, double grossPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.grossPrice = grossPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getGrossPrice() {
        return grossPrice;
    }
}
