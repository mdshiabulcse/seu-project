public class Invoice {
    private String username;
    private String email;
    private String tourLocation;
    private int tourDays;
    private double totalAmount;
    private String paymentMethod;

    public Invoice(String username, String email, String tourLocation, int tourDays, double totalAmount, String paymentMethod) {
        this.username = username;
        this.email = email;
        this.tourLocation = tourLocation;
        this.tourDays = tourDays;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    public void displayInvoice() {
        System.out.println("\n===== Invoice =====");
        System.out.println("Name: " + username);
        System.out.println("Email: " + email);
        System.out.println("Tour Location: " + tourLocation);
        System.out.println("Duration: " + tourDays + " days");
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("====================\n");
    }
}
