import java.util.Scanner;
public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] num = new byte[3];
        int [] num2 = new int[num.length];
        byte numSum = 0;
            for (int i = 0; i< num.length; i++){
                try{
                    num2[i] = Integer.parseInt(in.nextLine());
                }catch (NumberFormatException e){
                    System.out.println("введена строка");
                    break;
                }
            }
                for (int arr: num2) {
                    try{
                        if (arr <= Byte.MIN_VALUE || arr >= Byte.MAX_VALUE) {
                            throw new Exception("ввод или вычисление значения за границами диапазона типа");
                        }
                        numSum += arr;
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
        System.out.println(numSum / num.length);

    }
}


