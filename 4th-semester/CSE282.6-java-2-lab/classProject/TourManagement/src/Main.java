import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<User> registeredUsers = new ArrayList<>();
    private static List<TourLocation> locations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Step 1: Register users
        registeredUsers.add(new User("user1", "pass1", "Shiabul Islam", "shiabul@mail.com"));
        registeredUsers.add(new User("user2", "pass2", "Rakib", "rakib@mail.com"));

        // Step 2: Add tour locations
        addTourLocations();

        // Step 3: Login process
        User currentUser = login();
        if (currentUser == null) {
            System.out.println("Login failed. Exiting the program.");
            return;
        }

        // Step 4: Proceed with booking after login
        System.out.println("\nWelcome, " + currentUser.getName() + "! You are logged in.");
        proceedWithTourBooking(currentUser);
    }

    // Method to add tour locations
    private static void addTourLocations() {
        locations.add(new TourLocation("Sundarban"));
        locations.add(new TourLocation("Saint Martin Iland"));
        locations.add(new TourLocation("Syleth"));
    }

    // Login functionality
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

    // Tour booking process
    private static void proceedWithTourBooking(User currentUser) {
        Tour tour = selectTourType();
        if (tour != null) {
            tour.showTourDetails();

            System.out.println("\nDo you want to book this tour? (yes/no)");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("yes")) {
                System.out.println("\nTour successfully booked! Here are your details:");
                showUserInfo(currentUser);
                tour.showTourDetails();
                System.out.println("Your tour has been confirmed! Have a great trip!");
            } else {
                System.out.println("Tour booking canceled.");
            }
        }
    }

    // Display user information
    private static void showUserInfo(User user) {
        System.out.println("\nUser Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }

    // Tour type selection with location
    private static Tour selectTourType() {
        System.out.println("Choose a tour type:");
        System.out.println("1. Single Tour\n2. Group Tour");
        int tourType = Integer.parseInt(scanner.nextLine());

        System.out.println("Available tour locations:");
        for (int i = 0; i < locations.size(); i++) {
            System.out.println((i + 1) + ". " + locations.get(i));
        }
        System.out.print("Select a location: ");
        int locationChoice = Integer.parseInt(scanner.nextLine()) - 1;

        if (locationChoice < 0 || locationChoice >= locations.size()) {
            System.out.println("Invalid location selection.");
            return null;
        }

        TourLocation selectedLocation = locations.get(locationChoice);

        System.out.print("Enter Number of Days: ");
        int days = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Charge per Person: ");
        double chargePerPerson = Double.parseDouble(scanner.nextLine());

        if (tourType == 1) {
            return new SingleTour(selectedLocation.getLocationName(), days, chargePerPerson);
        } else if (tourType == 2) {
            System.out.print("Enter Group Size: ");
            int groupSize = Integer.parseInt(scanner.nextLine());
            return new GroupTour(selectedLocation.getLocationName(), days, chargePerPerson, groupSize);
        } else {
            System.out.println("Invalid tour type.");
            return null;
        }
    }
}
