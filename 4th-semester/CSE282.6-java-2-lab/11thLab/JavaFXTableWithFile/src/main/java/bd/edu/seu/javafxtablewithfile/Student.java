package bd.edu.seu.javafxtablewithfile;

public class Student {
    private int index;
    private String studentName;
    private String studentID;
    private String studentDept;
    private int studentBatch;
    public Student(int index, String studentName, String studentID, String studentDept, int studentBatch) {
        this.index = index;
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentDept = studentDept;
        this.studentBatch = studentBatch;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getStudentDept() {
        return studentDept;
    }
    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }
    public int getStudentBatch() {
        return studentBatch;
    }
    public void setStudentBatch(int studentBatch) {
        this.studentBatch = studentBatch;
    }

}
