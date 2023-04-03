package individual_work.exemple_8;
import individual_work.exemple_8.lineList.Node;
public class recursion {

    public static void main(String[] args) {

        Node head = createTailRec(new Node(5, null), 5);
        Node head1 = createHeadRec(new Node(5, null), 5);
        toStringRec(head);
        toStringRec(head1);
    }

    private static void toStringRec(Node head) {
        Node ref = head;
        String str = "";
        while (ref != null){
            str += ref.value;
            ref = ref.next;
        }
        System.out.println(str);
    }

    // заполнение с хвоста
    private static Node createTailRec(Node node, int value) {
        if(value == 0) {
            return null;
        }
        node.next = createTailRec(new Node(value-1, null), value-1);
        return node;
    }
    // заполнение с головы
    private static Node createHeadRec(Node node, int value) {
        if(value == 0) {
            return null;
        }
        node.next = createHeadRec(new Node(value-1, node.next), value-1);
        return node;
    }


}
