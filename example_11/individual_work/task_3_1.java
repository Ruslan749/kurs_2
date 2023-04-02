/*
Создать два проекта, в которых продемонстрировать
два способа создания линейного однонаправленного списка
(с головы и с хвоста) согласно примеру 2 из второго раздела.
Отработать код с помощью отладчика и привести
скриншоты минимум трех точек, обработанных отладчиком
 */
package individual_work;
public class task_3_1 {
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

    static class Node{ //КЛАСС - СТРУКТУРА ЭЛИМЕНТА СПИСКА
        public int value; // значение
        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next){ // конструктор класса
            this.value = value;
            this.next = next;
        }

    }
}


