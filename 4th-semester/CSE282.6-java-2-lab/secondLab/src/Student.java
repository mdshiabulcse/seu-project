public class Student {
    long studentId;
    String studentName;
    float studentGpa;

    void isValidForCertificate(float gpa){
        if(gpa>=2.5){
            System.out.println("You are eligible for the certificate");
        }else {
            System.out.println("You are not eligible for the certificate");
        }
    }
}
