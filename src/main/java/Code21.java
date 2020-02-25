import java.util.Stack;

/**
 * 二叉树的遍历 先序中序后序
 */
public class Code21 {
    public static class Node{
        public  int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value=data;
        }
    }


    public static void preOrderRecur(Node head){
        if (head==null){
            return;
        }
        /**
         * 先序中序后序 就是对于遍历值的位置不同而确定的
         */
         System.out.println(head.value);
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    /**
     * 用栈完成
     * @param head
     */
    public static void preOrderUnRecur(Node head){
        if (head!=null){
            Stack<Node> stack=new Stack<Node>();
            stack.add(head);
            while (!stack.isEmpty()){
                head=stack.pop();
                System.out.println(head.value+" ");
                if (head.right!=null){
                    stack.push(head.right);
                }
                if (head.left!=null){
                    stack.push(head.left);
                }

            }
        }
    }


    public static void inOrderUnRecur(Node head){
        if (head!=null){
            Stack<Node> stack=new Stack<Node>();

            while (!stack.isEmpty()||head!=null){
                if (head!=null){
                    stack.push(head);
                    head=head.left;
                }else {
                    head=stack.pop();
                    System.out.println(head.value);
                    head=head.right;
                }

            }
        }
    }


    public static void posOrderUnRecur1(Node head){
        if (head!=null){
            Stack<Node> stack=new Stack<Node>();
            Stack<Node> stack2=new Stack<Node>();
            stack.add(head);
            while (!stack.isEmpty()){
                head=stack.pop();
                stack2.push(head);
                if (head.right!=null){
                    stack.push(head.right);
                }
                if (head.left!=null){
                    stack.push(head.left);
                }

            }
            while (!stack2.isEmpty()){
                System.out.println(stack2.pop()+"  ");
            }
        }
    }


}
