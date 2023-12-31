interface Operations {
    public void append(int data);

    public void prepend(int data);

    public Node removeHead();

    public Node removeTail();

    public int size();

    public boolean insertAt(int data, int index);

    public boolean deleteAt(int index);

    public void printList();

}

class LinkedList implements Operations {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void append(int data) {
        if (head == null) {
            head = tail = new Node(data);
            size++;
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void prepend(int data) {
        if (head == null) {
            head = tail = new Node(data);
            size++;
            return;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    public Node removeHead() {
        if (size == 0)
            return null;
        Node prevHead = head;
        head = head.next;
        size--;
        return prevHead;
    }

    public Node removeTail() {
        if (size == 0)
            return null;
        Node curr;
        for (curr = head; curr.next.next != null;) {
            curr = curr.next;
        }
        Node tail = curr.next;
        curr.next = null;
        size--;
        return tail;
    }

    public int size() {
        return size;
    }

    public boolean insertAt(int data, int index) {
        Node curr = head;
        if (index > size - 1 || index < 0)
            return false;
        if (index == 0) {
            prepend(data);
            return true;
        }
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        Node node = new Node(data);
        node.next = curr.next;
        curr.next = node;
        size++;
        return true;
    }

    public boolean deleteAt(int index) {
        if (index > size || index < 0)
            return false;
        if (index == 0) {
            removeHead();
            return true;
        }
        if (index == size - 1) {
            removeTail();
            return true;
        }
        Node curr = head;
        Node prev = null;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        size--;
        return true;
    }

    public void printList() {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data + " ");
        }
    }

}

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