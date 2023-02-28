
import java.util.Scanner;
public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        int numSum = 0;
        for (int i = 0; i< num.length; i++){
            try{
                num[i] = Integer.parseInt(in.nextLine());

            }catch (NumberFormatException e){
                System.out.println("введена строка  или число не соответствующего типа данных");
                break;
            }
        }
              for (int arr: num) {
                numSum += arr;
                try {
                    if (arr < 0){
                        throw new RuntimeException(" данные имеют отрицательные числа");
                    }
                }catch (RuntimeException e){
                    System.out.println(e);
                }
            }
            System.out.println(numSum / num.length);
    }
}
