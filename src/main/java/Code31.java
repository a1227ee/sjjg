import java.util.Comparator;
import java.util.PriorityQueue;

public class Code31 {
    public static class Node{
        public int p;
        public int c;

        public Node(int p,int c){
            this.p=p;
            this.c=c;
        }
    }

    public static class Min implements Comparator<Node> {
        public int compare(Node o1, Node o2) {
            return o1.c-o2.c;
        }
    }

    public static class Max implements Comparator<Node> {
        public int compare(Node o1, Node o2) {
            return o2.p-o1.p;
        }
    }

    public static int find(int k,int w,int[] Profits,int[] Capital){
        Node[] nodes=new Node[Profits.length];
        for (int i=0;i<Profits.length;i++){
            nodes[i]=new Node(Profits[i],Capital[i]);
        }
        PriorityQueue<Node> minCostQ=new PriorityQueue<>(new Min());
        PriorityQueue<Node> maxProfitQ=new PriorityQueue<>(new Max());
        for (int i=0;i<nodes.length;i++){
            minCostQ.add(nodes[i]);
        }
        for (int i=0;i<k;i++){
            while (!minCostQ.isEmpty()&&minCostQ.peek().c<=w){
                maxProfitQ.add(minCostQ.poll());
            }
            if (maxProfitQ.isEmpty()){
                return w;
            }
            w+=maxProfitQ.poll().p;
        }
        return w;
    }


}
