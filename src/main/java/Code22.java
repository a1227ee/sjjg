public class Code22 {
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node parent;
        public Node(int data){
            this.value=data;
        }
    }
    public static Node getSuccessorNode(Node node){
        if (node==null){
            return node;
        }
         if (node.right!=null){
             return  getLeftMost(node.right);
         }else{
             Node parent=node.parent;
             while (parent!=null&&parent.left!=node){
                 node=parent;
                 parent=node.parent;
             }
             return parent;
         }
    }

    private static Node getLeftMost(Node node) {
        if (node==null){
            return node;
        }
        while (node.left!=null){
            node=node.left;
        }
        return node;
    }


    public static Node getbeforeNode(Node node){
        if (node ==null){
            return node;
        }
        if (node.left!=null){
            return getright(node.left);
        }else {
            Node parent=node.parent;
            while (parent!=null&&parent.right!=node){
                node=parent;
                parent=node.parent;
            }
            return parent;
        }
    }

    private static Node getright(Node left) {
        if (left==null){
            return left;
        }
        while (left.right!=null){
            left=left.right;
        }
        return left;
    }

}
