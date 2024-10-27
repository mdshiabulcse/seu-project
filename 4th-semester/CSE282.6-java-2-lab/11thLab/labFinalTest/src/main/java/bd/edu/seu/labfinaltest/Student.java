package bd.edu.seu.labfinaltest;

public class Student {
    private int indexId;
    private String name;
    private String studentId;
    private String subject;
    private String department;
    private  String cgpa;
    public Student(int indexId, String name, String studentId, String subject, String department, String cgpa) {
        this.indexId = indexId;
        this.name = name;
        this.studentId = studentId;
        this.subject = subject;
        this.department = department;
        this.cgpa = cgpa;
    }
    public int getIndexId() {
        return indexId;
    }
    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCgpa() {
        return cgpa;
    }
    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

}
