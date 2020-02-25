import java.util.Stack;

/**
 * 搜索二叉树(通过中序遍历)
 */
public class Code25 {

    public static boolean process(Node head){
        if (head!=null) {
            Stack<Node> stack=new Stack<Node>();
            int pre=Integer.MIN_VALUE;
            while (!stack.isEmpty()||head!=null){
                if (head!=null){
                    stack.push(head);
                    head=head.left;
                }else {
                    head=stack.pop();
                    if (pre>head.value){
                        return false;
                    }else {
                        pre=head.value;
                    }
                    head=head.right;
                }

            }
            return true;
        }
        return false;
    }
}
