package JSON.json2_3;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.println("""
                Введите действие которое вы хотите сделать:\s
                1. Прочитать файл
                2. Поиск книг по автору
                3. Добавить новую книгу
                4. Удалить книгу\s
                """);
        System.out.print(">>>  ");
        byte option = Byte.parseByte(in.nextLine()) ;

        switch (option) {
            case 1 -> showJson.show();
            case 2 -> System.out.println("вариант 2");
            case 3 -> System.out.println("вариант 3");
            case 4 -> System.out.println("вариант 4");
        }

    }
}
