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
        System.out.println("s1 information");
        System.out.println(s1.studentId);
        System.out.println(s1.studentName);
        System.out.println(s1.studentGpa);

        System.out.println("s2 information");
        System.out.println(s2.studentId);
        System.out.println(s2.studentName);
        System.out.println(s2.studentGpa);

        System.out.println("Do you want to take the certificate [Y/N]? ");
        String option = scanner.next();
        if (option.equals("Y")) {
            s2.isValidForCertificate(s2.studentGpa);
        }

    }
}
