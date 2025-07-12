public class Student {
    Long studentID;
    String name;
    String email;
    int batchNo;
    Student(Long _studentID, String _name, String _email, int _batchNo) {
        this.studentID = _studentID;
        this.name = _name;
        this.email = _email;
        this.batchNo = _batchNo;
    }
}
