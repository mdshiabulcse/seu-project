class Student {
    private int studentID;
    private double classTest1;
    private double classTest2;

    public Student(int studentID, double classTest1, double classTest2) {
        this.studentID = studentID;
        this.classTest1 = classTest1;
        this.classTest2 = classTest2;
    }

    public double getClassTest1() {
        return classTest1;
    }

    public double getClassTest2() {
        return classTest2;
    }
}
