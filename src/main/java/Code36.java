import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Code36
 * @Deacription:
 * @Author zzx
 * @Date 2020/2/16 0:17
 **/


public class Code36 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode(0);
        ListNode pre1=pre;
        while (l1!=null&&l2!=null){
            if (l1.val>l2.val){
                pre.next=l2;
                pre=l2;
                l2=l2.next;

            }else {
                pre.next=l1;
                pre=l1;

                l1=l1.next;

            }
        }
        while (l1!=null){
            pre.next=l1;
            pre=l1;
            l1=l1.next;
        }
        while (l2!=null){
            pre.next=l2;
            pre=l2;
            l2=l2.next;
        }

        return pre1.next;
    }

    public static void main(String[] args) {
        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(3);
        ListNode s4 = new ListNode(4);
        s1.next=s2;
        s2.next=s3;
        s3.next=s4;

        ListNode listNode = new Code36().swapPairs(s1);
    }

    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }

        ListNode p;

        //第2个列表
        ListNode pre=new ListNode(0) ;
        p=pre;
        //第三个
        ListNode pro=head.next.next;
        while (head!=null&&head.next!=null){
            pre.next=head.next;
            head.next.next=head;
            head.next=pro;
            pre=head;
            head=pro;
            pro=head.next.next;


        }
        return p.next;


    }






    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for (int i=1;i<=n+1;i++){

        }

        while (first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;




         return dummy.next;
    }



    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=head;
        List<ListNode> list=new ArrayList<ListNode>();
        while (head!=null){
            list.add(head);
            head=head.next;
        }
        int size = list.size();
        int index = size -n;

        if (index==-1){
            return pre.next;
        }
        ListNode node = null;
        if (index>0) {
            node= list.get(index-1);
            node.next=node.next.next;
        }

        return pre;
    }
}




class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}