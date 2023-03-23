/*
приведен второй вариант метода main, в котором список строится
изначальным созданием «хвоста», причем для него создавать
дополнительную переменную не нужно.
Узел «головы» получается путем создания нового узла,
в котором старая ссылка на «голову» становится полем next, т.е. «хвостом».
 */

package dinamic_structure_data;
import dinamic_structure_data.task_6.Node;
public class task_8 {
    public static void main(String[] args) {
    // Добавление элиментов с перемещением головы (наращивание головы)
        Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new Node(i,head);
        }
    // Вывод элиментов на экран
        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }


}
