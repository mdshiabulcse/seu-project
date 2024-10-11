import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<User> registeredUsers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Step 1: Register users
        registeredUsers.add(new User("user1", "pass1", "Shiabul Islam", "md@dhiabul.com"));
        registeredUsers.add(new User("user2", "pass2", "Shakib Khan", "md@shakib.com"));

        // Step 2: Login process
        User currentUser = login();
        if (currentUser == null) {
            System.out.println("Login failed. Exiting the program.");
            return;
        }

        // Step 3: Continue with booking after login
        System.out.println("\nWelcome, " + currentUser.getName() + "! You are logged in.");
        proceedWithTourBooking(currentUser);
    }

    // Method for login functionality
    private static User login() {
        System.out.println("Please log in to proceed with booking.");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (User user : registeredUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        System.out.println("Invalid credentials. Please try again.");
        return null;
    }

    // Method to continue with the tour booking after login
    private static void proceedWithTourBooking(User currentUser) {
        // User selects tour location and type
        Tour tour = selectTourType();  // Now explicitly selects between Single and Group tour
        if (tour != null) {
            tour.showTourDetails();

            // Step 4: Confirm the tour booking
            System.out.println("\nDo you want to book this tour? (yes/no)");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("yes")) {
                System.out.println("\nTour successfully booked! Here are your details:");
                showUserInfo(currentUser);  // Display user details
                tour.showTourDetails();     // Show tour details
                System.out.println("Your tour has been confirmed! Have a great trip!");
            } else {
                System.out.println("Tour booking canceled.");
            }
        }
    }

    // Display user info after booking
    private static void showUserInfo(User user) {
        System.out.println("\nUser Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }

    // New method to handle tour type selection (Single Tour or Group Tour)
    private static Tour selectTourType() {
        System.out.println("Choose a tour type:");
        System.out.println("1. Single Tour\n2. Group Tour");
        int tourType = Integer.parseInt(scanner.nextLine());

        System.out.println("Choose a tour location from the following:");
        System.out.println("1. Coxbazar\n2. Sundarban\n3. Syleth");
        int locationChoice = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Number of Days: ");
        int days = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Charge per Person: ");
        double chargePerPerson = Double.parseDouble(scanner.nextLine());

        if (tourType == 1) {
            // Single Tour
            return new SingleTour(getLocation(locationChoice), days, chargePerPerson);
        } else if (tourType == 2) {
            // Group Tour
            System.out.print("Enter Group Size: ");
            int groupSize = Integer.parseInt(scanner.nextLine());
            return new GroupTour(getLocation(locationChoice), days, chargePerPerson, groupSize);
        } else {
            System.out.println("Invalid tour type selection.");
            return null;
        }
    }

    // Helper method to return the location based on choice
    private static String getLocation(int choice) {
        switch (choice) {
            case 1: return "Paris";
            case 2: return "London";
            case 3: return "New York";
            default: return "Unknown";
        }
    }
}
