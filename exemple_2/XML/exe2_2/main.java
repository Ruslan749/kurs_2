package XML.exe2_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выбирите цифру требуемого действия действие: " +
                "\n 1. Добавить элимент в XML" +
                "\n 2. Найти элимент в XML" +
                "\n 3. Найти и удалить элимент из XML");
        try {
            byte option = Byte.parseByte(in.nextLine());
            if (option > 3 || option < 1){
                throw new Exception();
            }
            switch (option) {
                case 1 -> System.out.println("Вариант 1");
                case 2 -> System.out.println("Вариант 2");
                case 3 -> System.out.println("Вариант 3");
            }
        }catch (NumberFormatException e){
            System.out.println("Неверные входные данные");
        } catch (Exception e) {
            System.out.println("Данные за приделами значений");
        }

        in.close();
    }
}
