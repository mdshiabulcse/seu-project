package collection_problem_solving;


import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter Five values: ");
        for (i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("This given values are Foreach: ");
        for(Integer num : al){
            System.out.println(num+ " ");
        }
        System.out.println("This given values are LOP: ");
        for (i = 0; i < 5; i++) {
            System.out.println(al.get(i));
        }
    }
}
