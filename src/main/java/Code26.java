import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 完全二叉树的判断
 */
public class Code26 {

    public static boolean isCBT(Code24.Node head){
        if (head==null){
            return true;
        }
        Queue<Code24.Node> queue=new LinkedList<Code24.Node>();
        boolean leaf=false;

        Code24.Node l=null;
        Code24.Node r=null;
        queue.offer(head);
        while (!queue.isEmpty()){
             head=queue.poll();
            l=head.left;
            r=head.right;
            if (leaf&&(l!=null||r!=null)||(l==null&&r!=null)){
                return false;
            }
            if (l!=null){
                queue.offer(l);
            }
            if (r!=null){
                queue.offer(r);
            }
            if (l==null||r==null){
                leaf=true;
            }

        }
        return true;
    }
}
