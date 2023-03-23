/*
однонаправленный связный список и заполняется значениями.
 */
package dinamic_structure_data;
import dinamic_structure_data.task_6.Node;
public class task_7 { // главный класс
    // создание не свзанных узлов с помощью конструктора
    public static void main(String[] args) {
        Node node0 = new Node(0,null);
        Node node1 = new Node(1,null);
        Node node2 = new Node(2,null);
        Node node3 = new Node(3,null);

        // связывание узлов списка с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        //Вывод с использованием вспомогательной переменной ref,
        //соответствующей текущему значению ссылки при прохождению по списку

        Node ref = node0;// для перемещения по списку достаточно помнить голову

        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
