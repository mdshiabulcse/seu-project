package products;

import users.Customer;

public class Cart extends CartInformation {
    private int numberOfProducts;
    private double totalAmount;
    private double amountPaid;
    private Customer customer;
    private Products[] products;

    public Cart(int quantity, double unitPrice, double grossPrice, int numberOfProducts, double totalAmount, double amountPaid, Customer customer, Products[] products) {
        super(quantity, unitPrice, grossPrice);
        this.numberOfProducts = numberOfProducts;
        this.totalAmount = totalAmount;
        this.amountPaid = amountPaid;
        this.customer = customer;
        this.products = products;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Products[] getProducts() {
        return products;
    }

    public double calculateTotalGrossPrice() {
        double total = 0;
        for (Products product : products) {
            total += product.getProductPrice();
        }
        return total;
    }
}
