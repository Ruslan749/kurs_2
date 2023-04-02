package individual_work.exemple_8;


import individual_work.exemple_8.lineList.Node;
public class dinamicData {
    public static void main(String[] args) {


        Node head = null;

//        createHead(head);
        createTail(head);



    }

    private static void Remove(Node head){

        Node ref = head;
        int k;
        k = 1;
        // поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < 5)) {
            ref = ref.next;
            k++;
        }
        // переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;
        result(head);
    }
    private static void removeFirst(Node head) {

       head = head.next;
       Remove(head);

    }

    private static void removeLast(Node head) {

        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        removeFirst(head);

    }

    private static void inset(Node head) {

        // создается новый элемент со значением 44 – для вставки
        Node newNode = new Node(44, null);
        Node ref;

        ref = head;
        int k=1;

        // поиск нужного положения узла для вставки
        while (ref.next!= null && (k < 3 )) {
            ref = ref.next;
            k++;
        }

        // переброска ссылок при вставке элемента
        newNode.next = ref.next.next;
        ref.next = newNode;
        removeLast(head);
    }

    // Добавление в начало списка
    private static void addFirst(Node head) {
        head = new Node(546,head);
        inset(head);
    }

    // добавление в конец списка
    private static void addLast(Node head) {
        Node newtail = new Node(123, null);

        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next=newtail;

    }

    // выведение значений в формате текста
    private static void result(Node head) {
        // Вывод элиментов на экран
        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    private static void createTail(Node head) {
        for (int i = 9; i >= 0; i--){
            head = new Node(i,head);
        }
        addLast(head);
        addFirst(head);
    }

//    private static void createHead(Node head) {
//
//        for (int i = 0; i <= 9; i++){
//            head = new Node(i,head);
//        }
//        result(head);
//    }



}
