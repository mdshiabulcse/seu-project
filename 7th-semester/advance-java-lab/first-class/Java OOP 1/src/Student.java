public class Student extends  Person{
    Long studentID;
//    String name;
    String email;
    static int batchNo;
//    Student(Long _studentID, String _name, String _email, int _batchNo) {
//        this.studentID = _studentID;
//        this.name = _name;
//        this.email = _email;
//        this.batchNo = _batchNo;
//    }

    @Override
    void showInformation(){
        System.out.println(batchNo);
        System.out.println(name);
    }
    static {
        batchNo=25;
    }


}
