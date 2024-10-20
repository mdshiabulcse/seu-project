import java.util.Scanner;

public class CardPayment extends Payment {
    private Scanner scanner = new Scanner(System.in);

    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.print("Enter your card number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Enter your card expiration date (MM/YY): ");
        String expirationDate = scanner.nextLine();
        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();

        System.out.println("Processing card payment of $" + amount + "...");
        // Here you can implement card processing logic
        System.out.println("Payment of $" + amount + " successful with card number " + cardNumber);
    }
}
