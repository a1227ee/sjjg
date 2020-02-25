/**
 * 一颗完全二叉树，求其节点的个数
 */
public class Code27 {
    public static int  nodeNum(Node head){
        if (head==null){
            return 0;
        }
        return bs(head,1,mostLeftLevel(head,1));
    }

    private static int mostLeftLevel(Node node, int level) {
        while (node!=null){
            level++;
            node=node.left;
        }

        return level-1;
    }

    public static int bs(Node node,int level,int h){
        if (level==h){
            return 1;
        }
        if (mostLeftLevel(node.right,level+1)==h){
            return (1<<(h-level))+bs(node.right,level+1,h);
        }else {
            return (1<<(h-level-1))+bs(node.left,level+1,h );
        }

    }

}
