package recursion;

public class task_5 {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    private static int fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2) + fact(n - 1);
        }
    }
}