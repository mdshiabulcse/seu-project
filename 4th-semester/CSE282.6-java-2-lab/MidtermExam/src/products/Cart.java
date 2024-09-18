package products;

import users.Customer;

public class Cart {
    protected int numberOfProducts;
    protected double totalAmount;
    protected double amountPaid;
    protected Customer customer;
    protected Products[] products;

    public Cart(int numberOfProducts, double totalAmount, double amountPaid, Customer customer, Products[] products) {
        this.numberOfProducts = numberOfProducts;
        this.totalAmount = totalAmount;
        this.amountPaid = amountPaid;
        this.customer = customer;
        this.products = products;
    }

    public Products[] getProducts() {
        return products;
    }
}
