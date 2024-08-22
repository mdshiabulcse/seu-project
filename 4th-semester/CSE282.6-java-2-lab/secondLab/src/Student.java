public class Student {
    int studentId;
    String studentName;
    float studentGpa;

    public void isValidForCertificate(float gpa) {
        if (gpa >= 3.0) {
            System.out.println("You are eligible for the certificate.");
        } else {
            System.out.println("You are not eligible for the certificate.");
        }
    }
}