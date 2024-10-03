import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tour Management System!");
        System.out.println("Choose type of tour:");
        System.out.println("1. Single Tour");
        System.out.println("2. Group Tour");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.println("Enter Tour Location:");
        String location = scanner.nextLine();
        System.out.println("Enter Number of Days:");
        int days = scanner.nextInt();
        System.out.println("Enter Charge per Person:");
        double chargePerPerson = scanner.nextDouble();

        Tour tour;
        if (choice == 1) {
            // Single Tour
            tour = new SingleTour(location, days, chargePerPerson);
        } else if (choice == 2) {
            // Group Tour
            System.out.println("Enter Number of People:");
            int numberOfPeople = scanner.nextInt();
            tour = new GroupTour(location, days, chargePerPerson, numberOfPeople);
        } else {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }

        // Show Tour Details
        tour.showTourDetails();

        // Book or Confirm Option
        System.out.println("\nDo you want to book the tour? (yes/no)");
        scanner.nextLine();  // Consume newline
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("\nTour successfully booked! Here are your tour details:");
            tour.showTourDetails();  // Show the tour details again as confirmation
            System.out.println("Your tour has been confirmed! Have a great trip!");
        } else {
            System.out.println("Tour booking canceled.");
        }

        scanner.close();
    }
}