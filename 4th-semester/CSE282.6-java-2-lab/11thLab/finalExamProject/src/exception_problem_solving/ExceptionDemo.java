package exception_problem_solving;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
//            int x=10;
//            int y=0;
//            int result = x/y;
//            System.out.println("Result: "+result);
            int [] a=new int[5];
            a[5]=10;
        }catch (ArithmeticException e) {
            System.out.println("Exception error: "+e.getMessage());
        }catch (Exception e1) {
            System.out.println("Exception error1: "+e1.getMessage());
        } finally {
            System.out.println("Last Of the Program");
        }

    }
}
