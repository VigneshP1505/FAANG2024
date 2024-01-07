public class GetNth {
    public static int getNthNode(LinkedList ll,int index) throws Exception {
        if(ll.isEmpty()) throw new Exception("list is empty!");
        if(index<0 || index>=ll.size()) throw new Exception("index invalid!");
        Node curr=ll.head;
        for(int i=0;curr!=null;++i){
            if(i==index) break;
            curr=curr.next;
        }
        return curr.data;
    }

    public static void main(String[] args) throws Exception {
        LinkedList ll=new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        System.out.println(getNthNode(ll,2));
    }

}
