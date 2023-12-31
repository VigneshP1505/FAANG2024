public class Reverse {

    private static Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.printList();
        System.out.println();
        Node head = reverseList(ll.head);
        ll.setHead(head);
        ll.printList();
    }
}
