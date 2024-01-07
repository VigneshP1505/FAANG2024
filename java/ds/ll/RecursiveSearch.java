public class RecursiveSearch {

    public static boolean search(Node curr,int x){
        if(curr==null) return false;
        if(curr.data==x) return true;
        return search(curr.next,x);
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(15);
        ll.append(12);
        ll.append(13);
        System.out.println(search(ll.head,15));
        System.out.println(search(ll.head,11));
    }
}
