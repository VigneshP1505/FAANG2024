public class FetchMiddle {
    public static int getMiddle(LinkedList list) throws Exception {
        if(list.isEmpty()) throw new Exception("LinkedList empty!");
        Node head=list.head;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }

    public static void main(String[] args) throws Exception {
        LinkedList ll=new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        System.out.println(getMiddle(ll));
    }

}
