import java.util.Stack;

/**
 * 判断一个链表是否有回文结构
 */
public class Code17 {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value=data;
        }
    }
    //1
    public static  boolean isPalindrome1(Node head){
       Stack<Node> stack=new Stack<Node>();
       Node cur=head;
       while (cur!=null){
           stack.push(cur);
           cur=cur.next;
       }
       while (head!=null){
           if (head.value!=stack.pop().value){
               return false;
           }
           head=head.next;
       }
       return true;
    }


    public static  boolean isPalindrome3(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node n1 = head;
        Node n2 = head;
        while (n2.next != null && n2.next.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = null;
        Node n3 = null;
        while (n2 != null) {
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }
        n3 = n1;
        n2 = head;
        boolean res = true;
        while (n1 != null && n2 != null) {
            if (n1.value != n2.value) {
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        n1=n3.next;
        n3.next=null;
         while (n1!=null){
             n2=n1.next;
             n1.next=n3;
             n3=n1;
             n1=n2;
         }
         return res;



    }





}
