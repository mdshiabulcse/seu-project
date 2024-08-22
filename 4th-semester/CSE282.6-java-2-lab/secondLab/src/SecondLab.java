import java.util.Scanner;

public class SecondLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student s1 = new Student();
        s1.studentId = 1;
        s1.studentName = "A";
        s1.studentGpa = 3.50f;


        Student s2 = new Student();
        s2.studentId = 2;
        s2.studentName = "B";
        s2.studentGpa = 2.40f;


        System.out.println("s1 information:");
        System.out.println("ID: " + s1.studentId);
        System.out.println("Name: " + s1.studentName);
        System.out.println("GPA: " + s1.studentGpa);


        System.out.println("s2 information:");
        System.out.println("ID: " + s2.studentId);
        System.out.println("Name: " + s2.studentName);
        System.out.println("GPA: " + s2.studentGpa);


        System.out.println("Do you want to take the certificate [Y/N]? ");
        String option = scanner.next();


        scanner.nextLine();


        if (option.equalsIgnoreCase("Y")) {
            s2.isValidForCertificate(s2.studentGpa);
        }


        System.out.println("Enter a number to get the corresponding grade: ");
        if(scanner.hasNextFloat()) {
            float number = scanner.nextFloat();
            String grade = getGrade(number);
            System.out.println("The grade for the number " + number + " is: " + grade);
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
        }


        System.out.println("The actual CGPA of student " + s2.studentName + " is: " + s2.studentGpa);
    }


    public static String getGrade(float number) {
        if (number >= 90) {
            return "A";
        } else if (number >= 80) {
            return "B";
        } else if (number >= 70) {
            return "C";
        } else if (number >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
