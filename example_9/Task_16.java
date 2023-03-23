
import java.util.Scanner;
public class Task_16 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int num = 0;
        try {
            num = in.nextInt();
        }catch ( Exception e){
            System.out.println("данные являються строкой");
        }

        try {
            for (int i = 0; i < arr.length; i++){
                for (int j: arr[i]){
                    if (j == num){
                        System.out.println("номер строки искомого элимента: " + i);
                    } else {
                        throw new Exception("Нет такого номера");
                    }
                }
            }
        } catch (Exception e) {
                System.out.println("таких данных нет");
            }
    }
}
