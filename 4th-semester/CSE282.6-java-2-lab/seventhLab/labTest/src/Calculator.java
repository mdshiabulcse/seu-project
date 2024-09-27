public class Calculator {
    public static double calculateMean(double[] marks) {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }


    public static double calculateVariance(double[] marks, double mean) {
        double sumSquaredDifferences = 0;
        for (double mark : marks) {
            sumSquaredDifferences += Math.pow(mark - mean, 2);
        }
        return sumSquaredDifferences / marks.length;
    }

    public static double calculateDifference(double value1, double value2) {
        return Math.abs(value1 - value2);
    }
}
