/*
6.	Напишите функцию, которая принимает на вход
 список целых чисел и возвращает новый список, содержащий только те числа,
  которые делятся на заданное число без остатка.
 */
package individual_work;

import java.util.Arrays;
import java.util.Random;

public class work_6 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        Random random = new Random();
        int num = 3;

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(200);
        }

        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr,num);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));

    }

    private static int[] filterEvenNumbers(int[] arr, int j) {

        return Arrays.stream(arr)
                .filter(x -> x % j == 0)
                .toArray();
    }
}
