public class LastToHead {
    public static Node lastToHead(LinkedList ll) throws Exception {
        if(ll.isEmpty()) throw new Exception("List is empty!");
        if(ll.size()==1) return ll.head;
        Node tail=ll.tail;
        Node curr=ll.head;
        while(curr.next!=tail){
            curr=curr.next;
        }
        ll.tail=curr;
        ll.tail.next=null;
        tail.next=ll.head;
        ll.head=tail;
        return ll.head;
    }

    public static void main(String[] args) throws Exception {
        LinkedList ll=new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.printList();
        System.out.println();
        lastToHead(ll);
        ll.printList();
    }

}
