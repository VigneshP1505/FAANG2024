public class AddOne {

    public static Node reverseList(Node node){
        return null;
    }

    public static Node addOne(LinkedList ll) throws Exception {
        if(ll.isEmpty()) throw new Exception("List is empty!");
        reverseList(ll.head);
        Node curr=ll.head;
        int data=curr.data+1;
        curr.data=data%10;
        int carry=data/10;
        curr=curr.next;
        while(curr.next!=null && carry>0){
            data=curr.data+carry;
            curr.data=data%10;
            carry=data/10;
            curr=curr.next;
        }
        if(carry>0){
            Node n=new Node(carry);
            curr.next=n;
            ll.tail=n;
        }
        reverseList(ll.head);
        return ll.head;
    }

}
