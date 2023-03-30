package individual_work;

import java.util.Scanner;

public class task_1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int num = in.nextInt();
        recursion (num);

    }

    private static void recursion(int i) {

        if (i > 0){
            recursion( i / 2);
            System.out.println(i % 2);
        }
    }
}
