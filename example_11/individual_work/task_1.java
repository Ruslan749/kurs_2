/*
Создать приложение с использованием рекурсии для перевода
целого числа, введенного с клавиатуры, в двоичную систему
счисления.
 */
package individual_work;

import java.util.Scanner;

public class task_1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 10;
        recursion(num);
        System.out.print(str);
    }

    static String str = "";

    private static void recursion(int i) {
        if (i > 0) {
            recursion(i / 2);
            str += Integer.toString(i % 2);
//            System.out.println(i % 2);
        }
    }
}
