package individual_work.list_and_set;
import individual_work.list_and_set.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {

//        SortedSet
//        SortedSet <Integer> sortedSet = new
//        TreeSet
//        Set<Integer> TreeSet = new TreeSet<>();

        arrayList.print ();

    }
    private static long addElements(List<Integer> list, int i) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int k = 0; k < i * 1000000; k++) {
            list.add(k);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

}
