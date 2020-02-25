import java.util.HashMap;

/**
 *  复制一个链表
 */
public class Code19 {
    public static class Node{
        public int value;
        public Node next;
        public Node rand;
        public Node(int data){
            this.value=data;
        }
    }

    public static Node copy(Node head){
        HashMap<Node,Node> map=new HashMap<Node, Node>();
        Node cur=head;
        while(cur!=null){
            map.put(cur,new Node(cur.value));
            cur=cur.next;
        }
        cur=head;
        while (cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).rand=map.get(cur.rand);
            cur=cur.next;
        }
        return  map.get(head);
    }

}
