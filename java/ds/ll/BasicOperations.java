public class BasicOperations {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.printList();
        System.out.println();
        ll.insertAt(30, 1);
        ll.printList();
        System.out.println();
        ll.insertAt(40, 1);
        ll.printList();
        System.out.println();
        ll.deleteAt(1);
        ll.printList();
        System.out.println();
        ll.deleteAt(2);
        ll.printList();
        System.out.println();
        ll.deleteAt(1);
        ll.printList();
        System.out.println();
    }
}