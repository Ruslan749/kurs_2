package individual_work.exemple_8;


public class lineList {
    public static class Node{ //КЛАСС - СТРУКТУРА ЭЛИМЕНТА СПИСКА
        public int value; // значение
        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next){ // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
}
