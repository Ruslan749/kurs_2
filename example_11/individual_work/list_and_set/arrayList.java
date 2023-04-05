package individual_work.list_and_set;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void print () {
        List<Integer> arrayList = new ArrayList<>();
        int i = 20;
        addElements(arrayList, i);
        System.out.println("Время выполнения операции добавления arrayList  в начале списка = " + addElementsFerst(arrayList, i));
        System.out.println("Время выполнения операции добавления arrayList  в середине списка = " + insertList(arrayList, i));
        System.out.println("Время выполнения операции добавления arrayList  в конце списка = " + addElementsLast(arrayList));

        System.out.println("Время выполнения операции удаления arrayList  в начале списка = " + removeElementsFerst(arrayList));
        System.out.println("Время выполнения операции удаления arrayList  в середине списка = " + removeInsertList(arrayList, i));
        System.out.println("Время выполнения операции удаления arrayList  в конце списка = " + removeElementsLast(arrayList));

        System.out.println("Время выполнения операции получения элимента arrayList по индексу = " + SearchElements(arrayList, i));
    }

    private static void addElements(List<Integer> list, int i) {

        for (int k = 0; k < i * 1000000; k++) {
            list.add(k);
        }

    }
    private static long addElementsFerst(List<Integer> list, int i) {


        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
            list.add(0,30);


        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long insertList (List<Integer> list, int i) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления в серидину колекции
        list.add(i,234);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long addElementsLast (List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления в серидину колекции
        list.add(list.size()-1, 587);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeElementsFerst(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        list.remove(0);


        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeInsertList (List<Integer> list, int i) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления в серидину колекции
        list.remove(i);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long removeElementsLast (List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления в серидину колекции
        list.remove(list.size()-1);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long SearchElements (List<Integer> list, int i) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления в серидину колекции
       System.out.println( list.get(i));
       System.out.println(list.size());

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
