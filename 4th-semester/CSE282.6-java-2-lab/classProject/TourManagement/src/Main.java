import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class
public class Main {
    private static List<User> registeredUsers = new ArrayList<>();
    private static List<TourLocation> locations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        registeredUsers.add(new User("user1", "pass1", "Shiabul Islam", "shiabul@mail.com"));
        registeredUsers.add(new User("user2", "pass2", "Rakib", "rakib@mail.com"));

        addTourLocations();

        User currentUser = login();
        if (currentUser == null) {
            System.out.println("Login failed. Exiting the program.");
            return;
        }

        System.out.println("\nWelcome, " + currentUser.getName() + "! You are logged in.");
        try {
            proceedWithTourBooking(currentUser);
        } catch (TourBookingException e) {
            System.out.println("Error during tour booking: " + e.getMessage());
        }
    }

    private static void addTourLocations() {
        locations.add(new TourLocation("Sundarban", 50.0));
        locations.add(new TourLocation("Saint Martin Island", 80.0));
        locations.add(new TourLocation("Sylhet", 60.0));
    }

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

    private static void proceedWithTourBooking(User currentUser) throws TourBookingException {
        Tour tour = selectTourType(currentUser);
        if (tour != null) {
            tour.showTourDetails();

            System.out.println("\nDo you want to book this tour? (yes/no)");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("yes")) {
                System.out.println("\nTour successfully booked! Here are your details:");
                showUserInfo(currentUser);
                tour.showTourDetails();
                System.out.println("Your tour has been confirmed! Have a great trip!");

                // Payment Option
                processPayment(tour.calculateTotalCharge(), currentUser, tour);
            } else {
                System.out.println("Tour booking canceled.");
            }
        } else {
            throw new TourBookingException("Tour selection failed.");
        }
    }

    private static void showUserInfo(User user) {
        System.out.println("\nUser Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }

    private static Tour selectTourType(User currentUser) throws TourBookingException {
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
            throw new TourBookingException("Invalid location selection.");
        }

        TourLocation selectedLocation = locations.get(locationChoice);
        double pricePerDayPerPerson = selectedLocation.getPricePerDayPerPerson();

        if (tourType == 1) {
            return new SingleTour(selectedLocation.getLocationName(), getTourDays(), pricePerDayPerPerson);
        } else if (tourType == 2) {
            System.out.print("Would you like to add yourself to the group? (yes/no): ");
            String addSelf = scanner.nextLine();
            GroupTour groupTour = new GroupTour(selectedLocation.getLocationName(), getTourDays(), pricePerDayPerPerson);
            if (addSelf.equalsIgnoreCase("yes")) {
                // Add current user as a group member
                groupTour.addGroupMember(new GroupMember(currentUser.getName(), currentUser.getEmail(), "User Phone", 25)); // Example info
            }
            System.out.print("Enter Group Size: ");
            int groupSize = Integer.parseInt(scanner.nextLine());
            addGroupMembers(groupTour, groupSize, addSelf.equalsIgnoreCase("yes"));
            return groupTour;
        } else {
            throw new TourBookingException("Invalid tour type selection.");
        }
    }

    private static int getTourDays() throws TourBookingException {
        System.out.print("Enter Number of Days: ");
        int days = Integer.parseInt(scanner.nextLine());
        if (days <= 0) {
            throw new TourBookingException("Number of days must be greater than zero.");
        }
        return days;
    }

    private static void addGroupMembers(GroupTour groupTour, int groupSize, boolean addSelf) throws TourBookingException {
        int membersToAdd = addSelf ? groupSize - 1 : groupSize; // If user is added, reduce member count

        System.out.println("Enter details for " + membersToAdd + " group members:");
        for (int i = 1; i <= membersToAdd; i++) {
            System.out.print("Enter Name for Member " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter Email for Member " + i + ": ");
            String email = scanner.nextLine();
            System.out.print("Enter Phone for Member " + i + ": ");
            String phone = scanner.nextLine();
            System.out.print("Enter Age for Member " + i + ": ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age <= 0) {
                throw new TourBookingException("Age must be greater than zero.");
            }
            groupTour.addGroupMember(new GroupMember(name, email, phone, age));
        }
    }

    private static void processPayment(double amount, User currentUser, Tour tour) throws TourBookingException {
        System.out.println("Choose a payment method:");
        System.out.println("1. Card Payment");
        System.out.println("2. Mobile Banking");
        int paymentChoice = Integer.parseInt(scanner.nextLine());

        Payment payment;
        String paymentMethod = "";
        switch (paymentChoice) {
            case 1:
                payment = new CardPayment(amount);
                paymentMethod = "Card Payment";
                break;
            case 2:
                String expectedOtp = "123456"; // Simulated OTP for demonstration
                payment = new MobileBankingPayment(amount, expectedOtp);
                paymentMethod = "Mobile Banking";
                break;
            default:
                throw new TourBookingException("Invalid payment method selected.");
        }

        payment.processPayment(); // This might throw an exception based on payment processing logic
        showPaymentConfirmation(currentUser, tour, amount);

        // Create and show the invoice
        Invoice invoice = new Invoice(currentUser.getName(), currentUser.getEmail(), tour.getLocation(), tour.getDays(), amount, paymentMethod);
        invoice.displayInvoice();
    }

    private static void showPaymentConfirmation(User user, Tour tour, double amount) {
        System.out.println("\nPayment Confirmation:");
        System.out.println("User Name: " + user.getName());
        System.out.println("Tour Location: " + tour.getLocation());
        System.out.println("Duration: " + tour.getDays() + " days");
        System.out.println("Total Amount Paid: $" + amount);
        System.out.println("Thank you for your payment! Enjoy your tour!");
    }
}
