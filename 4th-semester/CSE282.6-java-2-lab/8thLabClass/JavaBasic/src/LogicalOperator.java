import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.print("Enter your Letter:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a'||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("YES vowel");
        }else {
            System.out.println("Constant");
        }
    }
}
