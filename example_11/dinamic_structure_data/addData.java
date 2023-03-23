/*
Добавление элемента в конец списка. Для того чтобы добраться до последнего элемента,
необходимо пройтись по всему списку с «головы», пока не будет получен элемент, у которого
ссылка next на следующий элемент равна null. Далее добавляется новый элемент.
Ниже представлен фрагмент метода добавления элемента в конец списка.
 */
package dinamic_structure_data;
import dinamic_structure_data.task_6.Node;
public class addData {
    public static void main(String[] args) {
        // Добавление элиментов с перемещением головы (наращивание головы)
        Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new Node(i,head);
        }

        // создается новый элемент со значением 123 – будущий хвост
        Node newtail = new Node(123, null);

        // для перемещения по списку используется вспомогательная переменная ref,
        // которой в качестве начальной ссылки передается указатель на «голову»

        Node ref = head;

        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }
        // указателю последнего элемента присваиваем новый «хвост» (элемент)
        ref.next=newtail;

        Node ref2 = head;
        while (ref2.next != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }


}
