/*
    Добавление элемента в список в указанное место (вставка элемента).
Изначально полю next нового элемента присваивается ссылка на узел,
который был ранее под номером 2, а потом полю next первого элемента
присваивается ссылка на новый узел (именно в такой последовательности,
иначе список будет разорван).
 */
package dinamic_structure_data;
import dinamic_structure_data.task_6.Node;
public class addData2 {
    public static void main(String[] args) {
        // Добавление элиментов с перемещением головы (наращивание головы)
        Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new Node(i,head);
        }
        // создается новый элемент со значением 44 – для вставки
        Node newNode = new Node(44, null);
        Node ref;

        ref = head;    // используем временную переменную
        int k=1;   // счетчик элементов

        // поиск нужного положения узла для вставки
        while (ref.next!= null && (k < 3 )) {
            ref = ref.next;
            k++;
        }
        // переброска ссылок при вставке элемента
        newNode.next = ref.next.next;
        ref.next = newNode;

        //Вывод значений на экран
        Node ref2 = head;
        while (ref2 != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}
