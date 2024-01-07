public class DeleteAlternate {
    public static Node deleteAlternate(LinkedList ll) throws Exception {
        if(ll.isEmpty()) throw new Exception("List is empty!");
        if(ll.size()==1) return ll.head;
        for(Node curr=ll.head;curr!=null && curr.next!=null;){
            curr.next=curr.next.next;
            curr=curr.next;
        }
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
        deleteAlternate(ll);
        ll.printList();
    }

}
