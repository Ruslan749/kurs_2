/*
        Линейный однонаправленный список
Класс Node, который используется в линейном однонаправленном списке,
который хранит значение и ссылку на следующий элемент.
 */
package dinamic_structure_data;

public class task_6 {
    public static class Node{ //КЛАСС - СТРУКТУРА ЭЛИМЕНТА СПИСКА
        public int value; // значение
        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next){ // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
}
