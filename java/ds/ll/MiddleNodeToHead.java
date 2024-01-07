public class MiddleNodeToHead {
    public static Node middleToHead(LinkedList ll) throws Exception {
        if(ll.isEmpty()) throw new Exception("List is empty!");
        if(ll.size()==1) return ll.head;
        Node curr=ll.head,prev=ll.head;
        for(int i=0;i<ll.size()/2;++i){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        curr.next=ll.head;
        ll.head=curr;
        return ll.head;
    }

    public static void main(String[] args) throws Exception {
        LinkedList ll=new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.printList();
        System.out.println();
        middleToHead(ll);
        ll.printList();
    }

}
