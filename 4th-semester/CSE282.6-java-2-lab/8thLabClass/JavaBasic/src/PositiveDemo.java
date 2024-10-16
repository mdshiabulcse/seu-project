import java.util.Scanner;

public class PositiveDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = input.nextInt();
        if (num < 0){
            System.out.println("Negative number");
        }else if (num > 0){
            System.out.println("Positive number");
        }
        else {
            System.out.println("Number Zero");
        }
    }
}
