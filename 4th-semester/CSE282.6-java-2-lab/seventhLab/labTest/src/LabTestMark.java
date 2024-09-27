public class LabTestMark {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, 3.5, 3.0);
        students[1] = new Student(2, 4.5, 4.5);
        students[2] = new Student(3, 2.0, 3.0);
        students[3] = new Student(4, 2.5, 3.0);
        students[4] = new Student(5, 4.0, 3.5);

        double[] classTest1Marks = new double[5];
        double[] classTest2Marks = new double[5];

        for (int i = 0; i < students.length; i++) {
            classTest1Marks[i] = students[i].getClassTest1();
            classTest2Marks[i] = students[i].getClassTest2();
        }

        double meanTest1 = Calculator.calculateMean(classTest1Marks);
        double meanTest2 = Calculator.calculateMean(classTest2Marks);

        double varianceTest1 = Calculator.calculateVariance(classTest1Marks, meanTest1);
        double varianceTest2 = Calculator.calculateVariance(classTest2Marks, meanTest2);

        double meanDifference = Calculator.calculateDifference(meanTest1, meanTest2);
        double varianceDifference = Calculator.calculateDifference(varianceTest1, varianceTest2);

        System.out.println("Mean  Test 1: " + meanTest1);
        System.out.println("Mean  Test 2: " + meanTest2);
        System.out.println("Variance  Test 1: " + varianceTest1);
        System.out.println("Variance  Test 2: " + varianceTest2);
        System.out.println("Difference  means: " + meanDifference);
        System.out.println("Difference  variances: " + varianceDifference);
    }
}
