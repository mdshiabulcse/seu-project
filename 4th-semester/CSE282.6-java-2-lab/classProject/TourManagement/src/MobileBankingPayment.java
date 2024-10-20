import java.util.Scanner;

public class MobileBankingPayment extends Payment {
    private Scanner scanner = new Scanner(System.in);
    private String expectedOtp; // Assuming OTP is generated and sent to the user's phone

    public MobileBankingPayment(double amount, String expectedOtp) {
        super(amount);
        this.expectedOtp = expectedOtp; // Simulated expected OTP for verification
    }

    @Override
    public void processPayment() {
        System.out.print("Enter your mobile number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter OTP sent to your phone: ");
        String otp = scanner.nextLine();

        // Verify OTP
        if (verifyOtp(otp)) {
            System.out.println("Processing mobile banking payment...");
            System.out.println("Payment of $" + amount + " successful using mobile number " + phoneNumber);
        } else {
            System.out.println("Invalid OTP. Payment failed.");
        }
    }

    private boolean verifyOtp(String otp) {
        return otp.equals(expectedOtp);
    }
}
