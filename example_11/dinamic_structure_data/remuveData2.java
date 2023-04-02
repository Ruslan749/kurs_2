/*
Удаление элемента с заданным номером из списка.
Для этого ссылку элемента, предшествующего удаляемому, необходимо перебросить на элемент,
расположенный после удаляемого.
Рассмотрим пример удаления второго элемента. Схематично удаление где полю next первого
элемента задается указатель на третий элемент.
 */
package dinamic_structure_data;
import dinamic_structure_data.task_6.Node;
public class remuveData2 {
    public static void main(String[] args) {
        // Добавление элиментов с перемещением головы (наращивание головы)
        Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new Node(i,head);
        }
        ; // создаем вспомогательные переменные
        Node ref = head;
        int k;
        k = 1;
    // поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
    // переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;

    //Вывод значений на экран
    Node ref2 = head;
    while (ref2 != null){
        System.out.print(" " + ref2.value);
        ref2 = ref2.next;
    }
    }
}
