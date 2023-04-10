/*
9.	Напишите функцию, которая принимает на вход список строк и
возвращает новый список, содержащий только те строки, которые
содержат только буквы (без цифр и символов).
 */
package individual_work;

import java.util.List;
import java.util.stream.Collectors;
//"Work1 hard. Dream! big"
public class work_9 {
    public static void main(String[] args) {
        String string = "Work! hard. Dream big — Работай усердно. Мечтай@ по-крупному";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Cтрока после сплитования : " + "\n");
        for (String e: strings){
            System.out.println(e);
        }

        List<String> stringAfter = filterCapitalizedString(strings);
        System.out.println("\n" + "Cтрока после преобразования : " + "\n");

        for (String e: stringAfter){
            System.out.println(e);
        }
    }

    private static List<String> filterCapitalizedString(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[а-яА-Яa-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
