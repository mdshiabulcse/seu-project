import java.util.Scanner;

public class SecondLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student s1 = new Student();
        System.out.println("Enter details for student 1:");
        System.out.print("Student ID: ");
        s1.studentId = scanner.nextInt();
        System.out.print("Student Name: ");
        s1.studentName = scanner.next();
        System.out.print("Student GPA: ");
        s1.studentGpa = scanner.nextFloat();


        Student s2 = new Student();
        System.out.println("Enter details for student 2:");
        System.out.print("Student ID: ");
        s2.studentId = scanner.nextInt();
        System.out.print("Student Name: ");
        s2.studentName = scanner.next();
        System.out.print("Student GPA: ");
        s2.studentGpa = scanner.nextFloat();

        System.out.println("\nStudent 1 information:");
        displayStudentInfo(s1);

        System.out.println("\nStudent 2 information:");
        displayStudentInfo(s2);

        System.out.println("\nDo you want to check the certificate eligibility for student 1 [Y/N]? ");
        String option1 = scanner.next();

        if (option1.equalsIgnoreCase("Y")) {
            s1.isValidForCertificate(s1.studentGpa);
        }

        System.out.println("Do you want to check the certificate eligibility for student 2 [Y/N]? ");
        String option2 = scanner.next();

        if (option2.equalsIgnoreCase("Y")) {
            s2.isValidForCertificate(s2.studentGpa);
        }

        System.out.println("\nEnter a number to get the corresponding grade: ");
        if(scanner.hasNextFloat()) {
            float number = scanner.nextFloat();
            String grade = getGrade(number);
            System.out.println("The grade for the number " + number + " is: " + grade);
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        System.out.println("\nThe actual CGPA of student " + s1.studentName + " is: " + s1.studentGpa);
        System.out.println("The actual CGPA of student " + s2.studentName + " is: " + s2.studentGpa);
    }

    public static void displayStudentInfo(Student student) {
        System.out.println("ID: " + student.studentId);
        System.out.println("Name: " + student.studentName);
        System.out.println("GPA: " + student.studentGpa);
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
